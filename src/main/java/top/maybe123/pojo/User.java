package top.maybe123.pojo;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.Id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_password
     *
     * @mbg.generated
     */
    private String userPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_sex
     *
     * @mbg.generated
     */
    private Integer userSex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_age
     *
     * @mbg.generated
     */
    private Integer userAge;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_icon
     *
     * @mbg.generated
     */
    private byte[] userIcon;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.Id
     *
     * @return the value of user.Id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.Id
     *
     * @param id the value for user.Id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_name
     *
     * @return the value of user.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_name
     *
     * @param userName the value for user.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_password
     *
     * @return the value of user.user_password
     *
     * @mbg.generated
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_password
     *
     * @param userPassword the value for user.user_password
     *
     * @mbg.generated
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_sex
     *
     * @return the value of user.user_sex
     *
     * @mbg.generated
     */
    public Integer getUserSex() {
        return userSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_sex
     *
     * @param userSex the value for user.user_sex
     *
     * @mbg.generated
     */
    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_age
     *
     * @return the value of user.user_age
     *
     * @mbg.generated
     */
    public Integer getUserAge() {
        return userAge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_age
     *
     * @param userAge the value for user.user_age
     *
     * @mbg.generated
     */
    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_icon
     *
     * @return the value of user.user_icon
     *
     * @mbg.generated
     */
    public byte[] getUserIcon() {
        return userIcon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_icon
     *
     * @param userIcon the value for user.user_icon
     *
     * @mbg.generated
     */
    public void setUserIcon(byte[] userIcon) {
        this.userIcon = userIcon;
    }
}