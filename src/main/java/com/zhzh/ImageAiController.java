package com.zhzh;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: jason.zhao
 * @date:2019/7/2 14:27
 * @Description:
 */
@RestController
public class ImageAiController {
    private final AdvancedGeneral advancedGeneral;

    public ImageAiController(AdvancedGeneral advancedGeneral) {
        this.advancedGeneral = advancedGeneral;
    }

    @RequestMapping(value = "/ImageAi",method = RequestMethod.POST)
    public String getImageName(@RequestParam(name = "file") MultipartFile file) throws IOException {
        InputStream inputStream = file.getInputStream();
        return advancedGeneral.advancedGeneral(inputStream);
    }
}
