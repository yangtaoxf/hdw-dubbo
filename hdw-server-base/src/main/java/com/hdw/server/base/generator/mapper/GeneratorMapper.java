package com.hdw.server.base.generator.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hdw.api.base.generator.dto.TableDto;
import com.hdw.api.base.generator.entity.TableEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author JacksonTu
 * @version 1.0
 * @description
 * @since 2020/11/22 11:27
 */
public interface GeneratorMapper extends BaseMapper<TableEntity> {

    /**
     * 分页
     *
     * @param page
     * @param tableDto
     * @return
     */
    IPage<Map<String, Object>> pageList(IPage<Map<String, Object>> page, @Param("ew") TableDto tableDto);

    /**
     * 根据表名查询
     *
     * @param tableName
     * @return
     */
    Map<String, String> findByTableName(@Param("tableName") String tableName);

    /**
     * 根据表名查询
     *
     * @param tableName
     * @return
     */
    List<Map<String, String>> listByTableName(@Param("tableName") String tableName);
}
