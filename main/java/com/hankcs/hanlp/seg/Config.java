/*
 * <summary></summary>
 * <author>He Han</author>
 * <email>hankcs.cn@gmail.com</email>
 * <create-date>2014/10/30 10:06</create-date>
 *
 * <copyright file="Config.java" company="上海林原信息科技有限公司">
 * Copyright (c) 2003-2014, 上海林原信息科技有限公司. All Right Reserved, http://www.linrunsoft.com/
 * This source is subject to the LinrunSpace License. Please contact 上海林原信息科技有限公司 to get more information.
 * </copyright>
 */
package com.hankcs.hanlp.seg;

/**
 * 分词器配置项
 */
public class Config
{
    /**
     * 是否是索引分词（合理地最小分割）
     */
    public boolean indexMode = false;
    /**
     * 是否识别人名
     */
    public boolean nameRecognize = true;
    /**
     * 是否加载用户词典
     */
    public boolean useCustomDictionary = true;
}