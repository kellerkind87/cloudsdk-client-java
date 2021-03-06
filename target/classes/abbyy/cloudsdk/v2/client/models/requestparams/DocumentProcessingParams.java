package abbyy.cloudsdk.v2.client.models.requestparams;

import abbyy.cloudsdk.v2.client.models.TaskInfo;
import abbyy.cloudsdk.v2.client.models.enums.ExportFormat;
import abbyy.cloudsdk.v2.client.models.enums.ProcessingProfile;
import abbyy.cloudsdk.v2.client.models.enums.TextType;
import abbyy.cloudsdk.v2.client.models.enums.WriteTags;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

/**
 * Parameters for Document Processing request
 */
public final class DocumentProcessingParams extends RequestParams<TaskInfo> {
    /**
     * Required. Specifies the identifier of the task. If the task with the
     * specified identifier does not exist or has been deleted, an error is
     * returned.
     */
    private UUID taskId;

    /**
     * Optional. Contains the description of the processing task. Cannot
     * contain more than 255 characters.
     */
    private String description;

    /**
     * Optional. Default is {@link ExportFormat#Rtf}. Specifies the export format.
     */
    @JsonProperty("exportFormat")
    private ExportFormat[] exportFormats;

    /**
     *  Optional. Default is {@link ProcessingProfile#DocumentConversion}. Specifies a profile with predefined processing settings.
     */
    private ProcessingProfile processingProfile;

    /**
     * Optional. Default is {@link TextType#Normal}. Specifies the type of the text on a page.
     */
    @JsonProperty("textType")
    private TextType[] textTypes;

    /**
     * Optional. Default "English". Specifies recognition language of the document.
     * This parameter can contain several language names separated with commas, for example
     * "English,French,German".
     *
     * <b>Note:</b> See <a href="https://www.ocrsdk.com/documentation/specifications/recognition-languages/"/>
     */
    private String language;

    /**
     * Optional. Default is {@link WriteTags#Auto}. Specifies whether the result must be written as tagged PDF.
     * This parameter can be used only if the {@link ExportFormat} parameter contains one of the
     * values for export to PDF.
     */
    @JsonProperty("pdf:writeTags")
    private WriteTags writeTags;

    /**
     * Optional. Default "false". Specifies whether the variants of characters recognition
     * should be written to an output file in XML format. This parameter can be used only
     * if the {@link ExportFormat} parameter contains xml or xmlForCorrectedImage value.
     */
    @JsonProperty("xml:writeRecognitionVariants")
    private Boolean writeRecognitionVariants;

    /**
     * Optional. Default "false". Specifies whether the paragraph and character styles
     * should be written to an output file in XML format. This parameter can be
     * used only if the {@link ExportFormat} parameter contains xml or
     * xmlForCorrectedImage value.
     */
    @JsonProperty("xml:writeFormatting")
    private Boolean writeFormatting;

    /**
     * Optional. Default "true" for xml export format and "false" in other cases.
     * Specifies whether barcodes must be detected on the image, recognized and exported
     * to the result file.
     */
    private Boolean readBarcodes;

    public DocumentProcessingParams() {
        super(TaskInfo.class);
    }

    public UUID getTaskId() {
        return taskId;
    }

    public void setTaskId(UUID taskId) {
        this.taskId = taskId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ExportFormat[] getExportFormats() {
        return exportFormats;
    }

    public void setExportFormats(ExportFormat[] exportFormats) {
        this.exportFormats = exportFormats;
    }

    public ProcessingProfile getProcessingProfile() {
        return processingProfile;
    }

    public void setProcessingProfile(ProcessingProfile processingProfile) {
        this.processingProfile = processingProfile;
    }

    public TextType[] getTextTypes() {
        return textTypes;
    }

    public void setTextTypes(TextType[] textTypes) {
        this.textTypes = textTypes;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public WriteTags getWriteTags() {
        return writeTags;
    }

    public void setWriteTags(WriteTags writeTags) {
        this.writeTags = writeTags;
    }

    public Boolean getWriteRecognitionVariants() {
        return writeRecognitionVariants;
    }

    public void setWriteRecognitionVariants(Boolean writeRecognitionVariants) {
        this.writeRecognitionVariants = writeRecognitionVariants;
    }

    public Boolean getWriteFormatting() {
        return writeFormatting;
    }

    public void setWriteFormatting(Boolean writeFormatting) {
        this.writeFormatting = writeFormatting;
    }

    public Boolean getReadBarcodes() {
        return readBarcodes;
    }

    public void setReadBarcodes(Boolean readBarcodes) {
        this.readBarcodes = readBarcodes;
    }
}
