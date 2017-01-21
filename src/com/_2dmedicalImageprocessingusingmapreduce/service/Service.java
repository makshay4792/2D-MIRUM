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
    public BufferedImage resizeImage(BufferedImage image, int width, int height);
}
