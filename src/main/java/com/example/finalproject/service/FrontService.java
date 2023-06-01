package com.example.finalproject.service;

import com.example.finalproject.model.ClassMeta;

import java.util.List;

public interface FrontService {
    List<Object[]> readMain(String category, String sido);

    // 서치페이지
    List<Object[]> readSearch(String search);
    // 라이크페이지
    List<Object[]> readLikey(String kId);

    // 득열이 추가분
    ClassMeta readOne(int link);

    List<String> readImg(int link);
}
