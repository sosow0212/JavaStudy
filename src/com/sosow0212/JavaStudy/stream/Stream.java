package com.sosow0212.JavaStudy.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
//        // 1. products 선언
//        List<Product> productList = List.of(
//                productFactory(1, "A", 1000),
//                productFactory(2, "A", 1500),
//                productFactory(3, "A", 300),
//                productFactory(4, "B", 3000),
//                productFactory(5, "C", 2000)
//        );
//
//
//        // 2. A제품만 선택하기 (필터링)
//        List<Product> aProduct = new ArrayList<>();
//        for (Product p : productList) {
//            if (p.getName().equals("A")) {
//                aProduct.add(p);
//            }
//        }
//
//
//        // 3. 가격 순 정렬
//        aProduct.sort(Comparator.comparing(Product::getPrice));
//
//
//        // 4. 아이디 출력
//        List<Integer> aProductId = new ArrayList<>();
//        for(Product p : aProduct) {
//            aProductId.add(p.getId());
//        }


        // 1. products 선언
        List<Product> productList = List.of(
                productFactory(1, "A", 1000),
                productFactory(2, "A", 1500),
                productFactory(3, "A", 300),
                productFactory(4, "B", 3000),
                productFactory(5, "C", 2000)
        );

        // 2. Stream 적용해보기
        List<Integer> aProductId = productList.stream()
                .filter(product -> product.getName().equals("A")) // 필터링
                .sorted(Comparator.comparing(Product::getPrice)) // 정렬
                .map(Product::getId)
                .collect(Collectors.toList()); // 아이디 값 출력
    }

    public static Product productFactory(Integer id, String name, int price) {
        return new Product(id, name, price);
    }
}

