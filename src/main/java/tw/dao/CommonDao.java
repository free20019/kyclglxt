package tw.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author: xianlehuang
 * @Description:
 * @date: 2020/12/15 - 10:48
 */
@Repository
public interface CommonDao {

    @Select("select 1 from dual")
    List<Map<String,Object>> test();
}
