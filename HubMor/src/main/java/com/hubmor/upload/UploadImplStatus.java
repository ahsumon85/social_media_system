package com.hubmor.upload;

import java.io.Serializable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

import org.primefaces.model.UploadedFile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UploadImplStatus implements Serializable, UploadStatus{
	private static final long serialVersionUID = 1L;

  @Override
    public void upload(String imgPath, String fileName,UploadedFile uploadFile)
    {
        ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();

        String filepath = servletContext.getRealPath("/Upload/"+imgPath) + File.separator + fileName;
       System.out.println("Img File Path "+filepath);
        try
        {
            InputStream is;
            try (FileOutputStream fos = new FileOutputStream(new File(filepath))) {
                is = uploadFile.getInputstream();
                int BUFFER_SIZE = 8192;
                byte[] buffer = new byte[BUFFER_SIZE];
                int a;
                while (true) {
                    a = is.read(buffer);
                    
                    if (a < 0) {
                        break;
                    }
                    
                    fos.write(buffer, 0, a);
                    
                    fos.flush();
                }  
            }

            is.close();
        } 
        catch (IOException e)
        {
            System.out.println("ImgUpload_Impl : uploadImg : "+e.getMessage());
        }
    }

	    
}
