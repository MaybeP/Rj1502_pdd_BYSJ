package top.maybe123.pojo;

public class MyImage {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column my_image.image_id
     *
     * @mbg.generated
     */
    private Integer imageId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column my_image.cp_id
     *
     * @mbg.generated
     */
    private Integer cpId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column my_image.image_image
     *
     * @mbg.generated
     */
    private byte[] imageImage;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column my_image.image_id
     *
     * @return the value of my_image.image_id
     *
     * @mbg.generated
     */
    public Integer getImageId() {
        return imageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column my_image.image_id
     *
     * @param imageId the value for my_image.image_id
     *
     * @mbg.generated
     */
    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column my_image.cp_id
     *
     * @return the value of my_image.cp_id
     *
     * @mbg.generated
     */
    public Integer getCpId() {
        return cpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column my_image.cp_id
     *
     * @param cpId the value for my_image.cp_id
     *
     * @mbg.generated
     */
    public void setCpId(Integer cpId) {
        this.cpId = cpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column my_image.image_image
     *
     * @return the value of my_image.image_image
     *
     * @mbg.generated
     */
    public byte[] getImageImage() {
        return imageImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column my_image.image_image
     *
     * @param imageImage the value for my_image.image_image
     *
     * @mbg.generated
     */
    public void setImageImage(byte[] imageImage) {
        this.imageImage = imageImage;
    }
}