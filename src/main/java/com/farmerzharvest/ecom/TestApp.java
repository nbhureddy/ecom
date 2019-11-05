//package com.farmerzharvest.ecom;
//
//import static org.springframework.util.CollectionUtils.isEmpty;
//
//import java.util.HashMap;
//import java.util.Map;
//import org.springframework.util.StringUtils;
//
//public class TestApp {
//
//  public static void main(String [] args) {
//    String segmentName = "abc";
//    String surveyQuestionSQL =
//        "select distinct s1.question_pos, s1.question_text, s1.answer_pos, s1.answer_text, COALESCE(s2.count, 0) as answer_count, "
//            + "${outer_segment} as segment_value "
//            + "from umc_employer_surveys s1"
//            + " LEFT  JOIN (select question_key, answer_key, sum(answer_count) AS count ${segmentName}, ${segment_name} as segment from "
//            + " umc_survey_responses_agg"
//            + " where employer_key = ${employerKey} and survey_key = ${surveyKey} "
//            + " ${dynamicFilters} group by question_key, answer_key ${singleSegmentGroup} s2)"
//            + " on s1.question_key = s2.question_key"
//            + " and s1.answer_key = s2.answer_key"
//            + " where  s1.employer_key = %s and s1.survey_key= %s"
//            + " order by s1.question_pos, s1.answer_pos  ${segment}";
//    Map<String, String> fillers = new HashMap<>();
//    if (StringUtils.isEmpty(segmentName)) {
//      fillers.put("outer_segment", "s2.segment");
//      fillers.put("segment", ", s1.outer_segment");
//      fillers.put("segment_name", segmentName);
//      fillers.put("singleSegmentGroup", ", " + segmentName);
//    } else {
////      String dynamicFilters = StringUtils.EMPTY;
////      if (reportFilterDto != null && !isEmpty(reportFilterDto.getFilters())) {
////        dynamicFilters = prepareFilterSQL(reportFilterDto);
////      }
//      fillers.put("dynamicFilters", "dynamic");
//    }
//    fillers.put("employerKey", "123");
//    fillers.put("surveyKey", "123");
//
//    String sql = StringSubstitutor.replace(surveyQuestionSQL, fillers);
//  }
//}
