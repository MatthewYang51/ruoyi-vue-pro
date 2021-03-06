package cn.iocoder.dashboard.modules.tool.dal.mysql.dao.coegen;

import cn.iocoder.dashboard.framework.mybatis.core.mapper.BaseMapperX;
import cn.iocoder.dashboard.modules.tool.dal.mysql.dataobject.codegen.ToolCodegenColumnDO;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ToolCodegenColumnMapper extends BaseMapperX<ToolCodegenColumnDO> {

    default List<ToolCodegenColumnDO> selectByTableId(Long tableId) {
        return selectList(new QueryWrapper<ToolCodegenColumnDO>()
                .eq("table_id", tableId)
                .orderByAsc("ordinal_position"));
    }

}
