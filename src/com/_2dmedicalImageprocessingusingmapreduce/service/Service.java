/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com._2dmedicalImageprocessingusingmapreduce.service;

import java.awt.image.BufferedImage;

/**
 *
 * @author akshay
 */
public interface Service {

    /**
     * Takes BufferedImage and resizes it to widthXheight size
     * and return resized BufferedImage
     * 
     * @parameters              BufferedImage int int
     * @param image             input BufferedImage
     * @param width             desired width for resized image
     * @param height            desired height for resized image
     * @return BufferedImage    resized BufferedImage
     */
    public BufferedImage resizeImage(BufferedImage image, int width, int height);
    
    /**
     * This method takes input image as a BufferedImage and
     * converts it into vector and return the vector
     * 
     * @parameters              BufferedImage
     * @param bufferedImage     input image
     * @return String           vector in String form
     */
    public String getVector(BufferedImage bufferedImage);
}
