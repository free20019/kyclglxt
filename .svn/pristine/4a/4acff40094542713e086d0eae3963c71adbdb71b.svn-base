package tw.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tw.dao.CommonDao;
import tw.entity.BackMessage;

import java.util.List;
import java.util.Map;

/**
 * @author: xianlehuang
 * @Description:
 * @date: 2020/12/15 - 10:48
 */
@Service
@Slf4j
public class CommonService {

    @Autowired
    CommonDao commonDao;

    public BackMessage<Object> test() {
        try{
            List<Map<String,Object>> list = commonDao.test();
            return new BackMessage<Object>(200, "成功", list);
        }catch (Exception e){
            e.printStackTrace();
            return new BackMessage<Object>(400,"错误", e.getMessage());
        }
    }


}


