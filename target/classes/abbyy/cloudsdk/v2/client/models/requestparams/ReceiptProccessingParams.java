package abbyy.cloudsdk.v2.client.models.requestparams;

import abbyy.cloudsdk.v2.client.models.TaskInfo;
import abbyy.cloudsdk.v2.client.models.enums.FieldRegionExportMode;
import abbyy.cloudsdk.v2.client.models.enums.ImageSource;
import abbyy.cloudsdk.v2.client.models.enums.ReceiptRecognizingCountry;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters for Receipt Processing request
 */
public final class ReceiptProccessingParams extends RequestParams<TaskInfo> {
    /**
     * Optional. Contains a password for accessing password-protected images in PDF format.
     */
    private String pdfPassword;

    /**
     *  Optional. Contains the description of the processing task. Cannot contain more than 255 characters.
     */
    private String description;

    /**
     * Optional. Default is {@link ImageSource#Auto}. Specifies the source of the image.
     */
    private ImageSource imageSource;

    /**
     * Optional. Default "true". Specifies whether the orientation of the image should be automatically detected and corrected.
     * <ul>
     *   <li><b>true</b></li> The page orientation is automatically detected, and if it differs from normal the image is rotated.
     *   <li><b>false</b></li> The page orientation detection and correction is not performed.
     * </ul>
     */
    private Boolean correctOrientation;

    /**
     * Optional. Default "true". Specifies whether the skew of the image should be automatically detected and corrected.
     */
    private Boolean correctSkew;

    /**
     * Optional. Default is {@link ReceiptRecognizingCountry#Usa}.
     * Important! The technology fully supports the receipts from USA and France, other countries
     * are currently supported in beta mode. Specifies the country where the receipt was printed.
     * This parameter can contain several names of countries.
     */
    @JsonProperty("country")
    private ReceiptRecognizingCountry[] countries;

    /**
     * Optional. Default "false". Specifies whether the additional information on the recognized characters
     * (e.g. whether the character is recognized uncertainly) should be written to an output file in XML format.
     */
    @JsonProperty("xml:writeExtendedCharacterInfo")
    private Boolean writeExtendedCharacterInfo;

    /**
     * Optional. Default is {@link FieldRegionExportMode#DoNotExport}. Specifies if the coordinates of field regions
     * should be saved to the resulting XML file, and how the coordinates should be specified:
     * on the original or on the corrected image.
     */
    @JsonProperty("xml:fieldRegionExportMode")
    private FieldRegionExportMode fieldRegionExportMode;

    public ReceiptProccessingParams() {
        super(TaskInfo.class);
    }

    public String getPdfPassword() {
        return pdfPassword;
    }

    public void setPdfPassword(String pdfPassword) {
        this.pdfPassword = pdfPassword;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ImageSource getImageSource() {
        return imageSource;
    }

    public void setImageSource(ImageSource imageSource) {
        this.imageSource = imageSource;
    }

    public Boolean getCorrectOrientation() {
        return correctOrientation;
    }

    public void setCorrectOrientation(Boolean correctOrientation) {
        this.correctOrientation = correctOrientation;
    }

    public Boolean getCorrectSkew() {
        return correctSkew;
    }

    public void setCorrectSkew(Boolean correctSkew) {
        this.correctSkew = correctSkew;
    }

    public ReceiptRecognizingCountry[] getCountries() {
        return countries;
    }

    public void setCountries(ReceiptRecognizingCountry[] countries) {
        this.countries = countries;
    }

    public Boolean getWriteExtendedCharacterInfo() {
        return writeExtendedCharacterInfo;
    }

    public void setWriteExtendedCharacterInfo(Boolean writeExtendedCharacterInfo) {
        this.writeExtendedCharacterInfo = writeExtendedCharacterInfo;
    }

    public FieldRegionExportMode getFieldRegionExportMode() {
        return fieldRegionExportMode;
    }

    public void setFieldRegionExportMode(FieldRegionExportMode fieldRegionExportMode) {
        this.fieldRegionExportMode = fieldRegionExportMode;
    }
}
