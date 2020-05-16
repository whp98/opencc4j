package com.github.houbb.opencc4j.support.datamap;

import java.util.Map;

/**
 * 数据 map 接口
 * <p> project: opencc4j-IDataMap </p>
 * <p> create on 2020/5/16 19:33 </p>
 *
 * @author binbin.hou
 * @since 1.5.2
 */
public interface IDataMap {

    /**
     * 繁体=》简体 词组
     * @return 结果
     * @since 1.5.2
     */
    Map<String, String> tsPhrase();

    /**
     * 繁体=》简体 单个字
     * @return 结果
     * @since 1.5.2
     */
    Map<String, String> tsChar();

    /**
     * 简体=》繁体 词组
     * @return 结果
     * @since 1.5.2
     */
    Map<String, String> stPhrase();

    /**
     * 简体=》繁体 单个字
     * @return 结果
     * @since 1.5.2
     */
    Map<String, String> stChar();


}
