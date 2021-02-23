package github.sharke1024.serviceImpl;

import github.sharke1024.Hello;

/**
 * @Author DL_Wu
 * @Date 2021/2/23
 */
public class HelloImpl implements Hello {
    @Override
    public void hello(String msg) {
        System.out.println("接受到客户端请求");

        if (msg != null) {
            System.out.println("请求信息res=" + msg);
        }
    }
}
