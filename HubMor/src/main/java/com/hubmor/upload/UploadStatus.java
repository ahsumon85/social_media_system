
package com.hubmor.upload;

import org.primefaces.model.UploadedFile;
import org.springframework.stereotype.Component;


@Component
public interface UploadStatus
{
    public void upload(String imgPath,String fileName,UploadedFile uploadFile);

}
