package com.rabbiter.pet.service.impl;

import com.rabbiter.pet.entity.Article;
import com.rabbiter.pet.mapper.ArticleMapper;
import com.rabbiter.pet.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2023-04-04
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

}
