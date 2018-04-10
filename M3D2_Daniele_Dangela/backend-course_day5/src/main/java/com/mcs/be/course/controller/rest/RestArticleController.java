package com.mcs.be.course.controller.rest;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mcs.be.course.dto.ArticleDto;
import com.mcs.be.course.exception.ElementNotFound;
import com.mcs.be.course.facade.ArticleFacade;

@RestController
@RequestMapping(value = "/articles")
public class RestArticleController {

    private static final Logger LOGGER = LogManager.getLogger(RestArticleController.class);

    //TODO inject facade
    @Autowired
    private ArticleFacade articleFacade;

    //TODO create method that responds to /articles in GET and returning a list of ArticleDto
    @RequestMapping(method = RequestMethod.GET)
    public List<ArticleDto> getArticles(){
    	return articleFacade.retrieveAllArticles();
    }
    
    //TODO create method that responds to /articles/{id} in GET and returning a ArticleDto
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ArticleDto retrieveArticleById(@PathVariable("id") Long id) throws ElementNotFound {
    	return articleFacade.retrieveArticleById(id);
    }
    
    //TODO create method that responds to /articles/like in PATCH receiving a json like {"id" : 1} and returning a ArticleDto after updating his like value
    @RequestMapping(value = "/like" , method = RequestMethod.PATCH)
    public ArticleDto addLikeToArticle(@RequestBody ArticleDto articleDto) throws ElementNotFound {
    	return articleFacade.addLikeToArticle(articleDto.getId());
    }
    
    //TODO create method save or update
    @RequestMapping(method = RequestMethod.POST)
    public ArticleDto saveOrUpdate(@RequestBody ArticleDto articleDto) throws ElementNotFound {
    	return articleFacade.saveOrUpdate(articleDto);
    }
    
    @PatchMapping(value = "/search")
    public List<ArticleDto> getArticle(@RequestParam ("by") String title) throws ElementNotFound{
    	return articleFacade.searchBy(title);
    }
}
