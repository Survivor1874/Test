package com.lin.test.worldcup;

import java.util.*;

import com.alibaba.fastjson.JSON;
import com.lin.test.common.entity.BuyScheme;
import com.lin.test.common.entity.Result;
import com.lin.test.common.entity.WinLose;

import java.math.BigDecimal;

/**
 * @author linjun.li@quvideo.com
 * @date 2018-07-11 09:29
 **/
public class RevenueCalculation {

    public static void main(String[] args) {
        String json = "{\n" +
                "    \"incomes\": [\n" +
                "        {\n" +
                "            \"probability\": 0.23,\n" +
                "            \"score\": \"0:0\",\n" +
                "            \"singleScoreCount\": 200\n" +
                "        },\n" +
                "        {\n" +
                "            \"probability\": 0.34,\n" +
                "            \"score\": \"0:1\",\n" +
                "            \"singleScoreCount\": 300\n" +
                "        },\n" +
                "        {\n" +
                "            \"probability\": 0.34,\n" +
                "            \"score\": \"1:0\",\n" +
                "            \"singleScoreCount\": 200\n" +
                "        }\n" +
                "    ],\n" +
                "    \"winlose\": {\n" +
                "        \"probability\": 0.3,\n" +
                "        \"type\": 2,\n" +
                "        \"winloseCount\": 300\n" +
                "    }\n" +
                "}";
        BuyScheme buyScheme = JSON.parseObject(json, BuyScheme.class);
        calculateAllB(buyScheme);
    }

    private static Result calculateAllB(BuyScheme buyScheme) {
        Map<String, Double> resultMap = new HashMap<>();
        List<SingleScore> incomes = buyScheme.getIncomes();
        WinLose winlose = buyScheme.getWinlose();
        double outcome = 0;
        double income = 0;
        double expect = 0;
        for (SingleScore singleScore : incomes) {
            income += singleScore.singleScoreResult();
            outcome += singleScore.getSingleScoreCount();
            expect += singleScore.getProbability() * (singleScore.getSingleScoreCount());
            resultMap.put(singleScore.getScore(), singleScore.singleScoreResult());
        }
        income += winlose.winLoseResult();
        outcome += winlose.getWinloseCount();
        expect += winlose.getProbability()*winlose.getWinloseCount();
        BigDecimal rateOfReture = new BigDecimal(income).divide(new BigDecimal(outcome), 2, BigDecimal.ROUND_HALF_UP);
        System.out.println("outcome : " + income + " --- income : " + outcome + " --- rateOfReture : " + rateOfReture + " --- expect : " + expect);
        Result result = new Result();
        result.setOutcome(outcome);
        result.setIncome(income);
        result.setExpect(expect);
        result.setRate(rateOfReture);
        return result;
    }

    public static List<Result> statistic() {
        Long count = 0L;
        BuyScheme buyScheme;
        List<Result> results = new ArrayList<>();
        WinLose winLose = new WinLose();
        winLose.setWinloseCount(500);
        winLose.setType(0);
        for (int b00 = 0; b00 <= 400; b00 += 100) {
            for (int b01 = 0; b01 <= 400; b01 += 100) {
                for (int b02 = 0; b02 <= 400; b02 += 100) {
                    for (int b10 = 0; b10 <= 400; b10 += 100) {
                        for (int b11 = 0; b11 <= 400; b11 += 100) {
                            for (int b12 = 0; b12 <= 400; b12 += 100) {
                                for (int b20 = 0; b20 <= 400; b20 += 100) {
                                    for (int b21 = 0; b21 <= 400; b21 += 100) {
                                        for (int b22 = 0; b22 <= 400; b22 += 100) {
                                            buyScheme = new BuyScheme();
                                            List<SingleScore> lists = new ArrayList<>();
                                            SingleScore singleScore01 = new SingleScore();
                                            singleScore01.setScore("0:0");
                                            singleScore01.setSingleScoreCount(b00);
                                            lists.add(singleScore01);
                                            SingleScore singleScore02 = new SingleScore();
                                            singleScore02.setScore("0:1");
                                            singleScore02.setSingleScoreCount(b01);
                                            lists.add(singleScore02);
                                            SingleScore singleScore03 = new SingleScore();
                                            singleScore03.setScore("0:2");
                                            singleScore03.setSingleScoreCount(b02);
                                            lists.add(singleScore03);
                                            SingleScore singleScore04 = new SingleScore();
                                            singleScore04.setScore("1:0");
                                            singleScore04.setSingleScoreCount(b10);
                                            lists.add(singleScore04);
                                            SingleScore singleScore05 = new SingleScore();
                                            singleScore05.setScore("1:1");
                                            singleScore05.setSingleScoreCount(b11);
                                            lists.add(singleScore05);
                                            SingleScore singleScore06 = new SingleScore();
                                            singleScore06.setScore("1:2");
                                            singleScore06.setSingleScoreCount(b12);
                                            lists.add(singleScore06);
                                            SingleScore singleScore07 = new SingleScore();
                                            singleScore07.setScore("2:0");
                                            singleScore07.setSingleScoreCount(b20);
                                            lists.add(singleScore07);
                                            SingleScore singleScore08 = new SingleScore();
                                            singleScore08.setScore("2:1");
                                            singleScore08.setSingleScoreCount(b21);
                                            lists.add(singleScore08);
                                            SingleScore singleScore09 = new SingleScore();
                                            singleScore09.setScore("2:2");
                                            singleScore09.setSingleScoreCount(b22);
                                            lists.add(singleScore09);
                                            buyScheme.setIncomes(lists);
                                            buyScheme.setWinlose(winLose);
                                            Result result = calculateAllB(buyScheme);
                                            result.setBuyScheme(buyScheme);
                                            results.add(result);
                                            System.out.println(">>>>>>>>>>>>>>>>>>>>>>" + count++);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }

        return results;

    }


    private static void calculateAll(String json) {
        Integer outcome = 0;
        BigDecimal income = new BigDecimal(0);
        @SuppressWarnings("unchecked")
        Map<String, Integer> map = JSON.parseObject(json, Map.class);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String score = entry.getKey();
            Integer moneyCount = entry.getValue();
            outcome += moneyCount;
//            BigDecimal odds = EnglandVsCroatia.getFromScore(score);
//            income = income.add(odds.multiply(new BigDecimal(moneyCount)));
        }

        BigDecimal rateOfReture = income.divide(new BigDecimal(outcome), 2, BigDecimal.ROUND_HALF_UP);
        System.out.println("income : " + income + " --- outcome : " + outcome + " --- rateOfReture : " + rateOfReture);
    }

}
