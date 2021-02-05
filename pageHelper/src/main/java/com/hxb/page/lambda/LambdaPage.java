package com.hxb.page.lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description : Lambda分页
 * @Author : DaHuaiDan
 * @Create : 2021/2/5 13:58
 * @Version : 1.0
 */
public class LambdaPage {

    static List<Integer> data = Stream.iterate(1, item -> item + 1).limit(100).collect(Collectors.toList());


    public static void main(String[] args) {

        System.out.println(page(10, 3));

        System.out.println(page(10, 2));

        System.out.println(page(20, 2));
    }


    /**
     * 分页
     * @param pageSize 分页大小
     * @param pageNum 第几页
     * @return 分页后的数据
     */
    private static List<Integer> page(int pageSize, int pageNum){
        return data.stream().skip((long) pageSize * (pageNum - 1)).limit(pageSize).collect(Collectors.toList());
    }
}
