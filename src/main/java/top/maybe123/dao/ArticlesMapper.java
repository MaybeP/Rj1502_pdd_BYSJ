package top.maybe123.dao;

import java.util.List;
import top.maybe123.pojo.Articles;

public interface ArticlesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table articles
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table articles
     *
     * @mbg.generated
     */
    int insert(Articles record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table articles
     *
     * @mbg.generated
     */
    Articles selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table articles
     *
     * @mbg.generated
     */
    List<Articles> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table articles
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Articles record);
}