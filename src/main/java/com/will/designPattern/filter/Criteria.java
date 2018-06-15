package com.will.designPattern.filter;

import java.util.List;

/**
 * ClassName:Criteria
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月15日
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
