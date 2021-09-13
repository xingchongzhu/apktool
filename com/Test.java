package com;

/**
 * @author : xingchong.zhu
 * description :
 * date : 2021/9/10
 * mail : hangchong.zhu@royole.com
 */
public class Test implements Runnable{

    private User user;

    @Override
    public void run() {
        System.out.println(user);
    }
}
