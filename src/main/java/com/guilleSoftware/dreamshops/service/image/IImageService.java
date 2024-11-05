package com.guilleSoftware.dreamshops.service.image;

import com.guilleSoftware.dreamshops.dto.ImageDto;
import com.guilleSoftware.dreamshops.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDto> saveImages(List<MultipartFile> file, Long productId);
    void updateImage(MultipartFile file, Long imageId);
}
