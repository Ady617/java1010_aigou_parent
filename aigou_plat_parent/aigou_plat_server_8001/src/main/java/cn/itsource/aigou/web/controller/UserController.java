package cn.itsource.aigou.web.controller;

import cn.itsource.aigou.domain.User;
import cn.itsource.util.AjaxResult;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plat")
public class UserController {
    /**
     *  我们学习了restful风格
     *  地址：定位资源
     *  http动词：表示操作
     *
     *  post请求需要使用postman发
     * @param user
     * @return
     */
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody User user){
        if(user!=null&& !StringUtils.isEmpty(user.getName())&&!StringUtils.isEmpty(user.getPassword())){
            if("admin".equals(user.getName())&&"xxxooo".equals(user.getPassword())){
                return AjaxResult.me().setMsg("登陆成功");
            }else {
                return AjaxResult.me().setMsg("登录失败").setSuccess(false);
            }
        }
        return AjaxResult.me().setMsg("登录失败").setSuccess(false);
    }
}
