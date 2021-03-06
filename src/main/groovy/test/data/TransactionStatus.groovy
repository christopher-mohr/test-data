package test.data

import com.fasterxml.jackson.annotation.JsonProperty
import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.model.naming.NamingStrategies

@MappedEntity(namingStrategy = NamingStrategies.UnderScoreSeparatedLowerCase.class)
class TransactionStatus{

    @Id
    @GeneratedValue
    Integer id
    String uuid
    String fileName
    Float fileSize
    String status

    TransactionStatus() {
    }

    void setId(Integer id) {
        this.id = id
    }

    void setUuid(String uuid) {
        this.uuid = uuid
    }

    void setFileName(String fileName) {
        this.fileName = fileName
    }

    void setFileSize(Float fileSize) {
        this.fileSize = fileSize
    }

    void setStatus(String status) {
        this.status = status
    }

    Integer getId() {
        return id
    }

    @JsonProperty("uuid")
    String getUuid() {
        return uuid
    }

    @JsonProperty("fileName")
    String getFileName() {
        return fileName
    }

    @JsonProperty("fileSize")
    Float getFileSize() {
        return fileSize
    }

    @JsonProperty("status")
    String getStatus() {
        return status
    }
}

enum Status{
    started,
    processing,
    finished
}
