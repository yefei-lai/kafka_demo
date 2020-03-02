package com.kafka.kafka_demo;

import com.kafka.kafka_demo.util.Html2pdfUtil;

import java.io.IOException;

public class Converter {
    public static void main(String[] args) {
        try {
            long start = System.currentTimeMillis();
            String result = Html2pdfUtil.parseHtml2Pdf("/Users/laiyefei/Desktop/documents/prescTemplate.html");
            long all = System.currentTimeMillis() - start;
            System.out.println("pdf生成地址："+result+ "，用时："+ all/1000+"秒");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
