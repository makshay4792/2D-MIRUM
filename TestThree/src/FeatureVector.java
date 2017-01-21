
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.imageio.ImageIO;

public class FeatureVector {
	public static void main(String[] args) throws IOException {
		//String path1 = "/home/hduser/workspacekepler/Test/src/main/resources/input.jpg";
		//String path2 = "/home/hduser/workspacekepler/ProjectIP/resources/input1.jpg";
		FeatureVector fv = new FeatureVector();

		// System.out.println("Distance:"+fv.getDistance(fv.getFeature(path1),
		// fv.getFeature(path2)));
		//System.out.println(fv.getFeatureString(path1));
		
	
		//fv.getSobel(path1);
	}
	public BufferedImage getBlur(String path) throws IOException{
		int inPixels[][] = null,outPixels[][]=null;
		int h,w;
		File file = new File(path);
		BufferedImage image = ImageIO.read(file);
		
		BufferedImage newImg = new BufferedImage(image.getWidth(), image.getHeight(),
				image.getType());
		
		w = image.getWidth(null);
		h = image.getHeight(null);

		inPixels = new int[h][w];
		outPixels = new int[h][w];
		
		for (int yy = 0; yy < h; yy++) {
			for (int xx = 0; xx < w; xx++) {
				inPixels[yy][xx] = image.getRGB(xx, yy) & 0xffffff;
				outPixels[yy][xx] = image.getRGB(xx, yy) & 0xffffff;
			}
		}
		
		int col, r, g, b;
		int sum;
		for (int y = 1; y < h - 1; y++) {
			for (int x = 1; x < w - 1; x++) {
				sum = 0;
				for (int yy = y - 1; yy <= y + 1; yy++) {
					for (int xx = x - 1; xx <= x + 1; xx++) {
						col = inPixels[yy][xx];
						b = col & 0xff;
						g = (col >> 8) & 0xff;
						r = (col >> 16) & 0xff;
						// adding grayscale component to sum.
						sum += (r + g + b) / 3;
					}
				}

				// average of 8 surrounding pixels and center
				r = g = b = sum / 9;

				outPixels[y][x] = (b | (g << 8) | (r << 16));
				newImg.setRGB(x, y, outPixels[y][x]);
			}
		}
		
		//ImageIO.write(newImg, "jpg", new File("/home/hduser/workspacekepler/Test/src/main/resources/outBlur.jpg"));
		return newImg;
	}
	public BufferedImage getSobel(String path) throws IOException{
		BufferedImage image=getBlur(path);
		int w, h;
	    int inPixels[][], sobelX[][], sobelY[][];
	    
	    sobelX = new int[][] {{-1,0,1},{-2,0,2},{-1,0,1}};
        sobelY = new int[][] {{1,2,1},{0,0,0},{-1,-2,-1}};
        
        int sumX, sumY, sum;
        int gs;
        
        w = image.getWidth(null);
        h = image.getHeight(null);
        
        BufferedImage newImg=new BufferedImage(image.getWidth(), image.getHeight(),image.getType());
        
        
        
        inPixels = new int[h][w];
        int col, r, g, b;
        for(int yy=0;yy<h;yy++) {
            for(int xx=0;xx<w;xx++) {
                col = image.getRGB(xx,yy);
                b = col & 0xff;
                g = (col >> 8) & 0xff;
                r = (col >> 16) & 0xff;
                r = g = b = (r+g+b)/3;
                inPixels[yy][xx] = (r << 16) | (g << 8) | b;
                image.setRGB(xx, yy, inPixels[yy][xx]);
            }
        }
        
        for(int y=1;y<h-1;y++) {
            for(int x=1;x<w-1;x++) {
                sumX = sumY = 0;

                for(int xx=-1;xx<=1;xx++) {
                    for(int yy=-1;yy<=1;yy++) {
                        gs = inPixels[y+yy][x+xx] & 0xff; // only grayscale value...
                        sumX += sobelX[yy+1][xx+1] * gs;
                        sumY += sobelY[yy+1][xx+1] * gs;
                    }
                }

                sum = (int)Math.sqrt(sumX*sumX + sumY*sumY);

                sum = Math.min(Math.max(sum,0),255);
                sumX = Math.min(Math.max(sumX,0),255);
                sumY = Math.min(Math.max(sumY,0),255);

                sum = (sum << 16) | (sum << 8) | sum;

                newImg.setRGB(x,y,sum);
            }
        }
        
        
		//ImageIO.write(newImg, "jpg",new File("/home/hduser/workspacekepler/Test/src/main/resources/outSobel.jpg"));
		return newImg;
	}
	public ArrayList<Integer> getFeatureSobel(BufferedImage image) throws IOException{
		ArrayList<Integer> vector = new ArrayList<Integer>();
		for (int i = 0; i < 8; i++) {
			vector.add(0);
		}
		int h = image.getHeight();
		int w = image.getWidth();
		Color c;
		int r, ch, t;
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {
				c = new Color(image.getRGB(i, j));
				r = c.getRed();
				ch = r / 32;
				t = vector.get(ch);
				vector.set(ch, ++t);
			}
		}
		return vector;
	}
	public String getFeatureString(String path) throws IOException {
		ArrayList<Integer> vector1 = getFeatureGrayScale(path);
		ArrayList<Integer> vector2 = getFeatureSobel(getSobel(path));
		String feature = "";
		for (int i = 0; i < vector1.size(); i++) {
			if (i < vector1.size() - 1) {
				feature = feature + vector1.get(i).toString()+"$"+vector2.get(i).toString() + ",";
			} else {
				feature = feature + vector1.get(i).toString()+"$"+vector2.get(i).toString();
			}
		}
		return feature;
	}
	public ArrayList<Integer> getFeatureGrayScale(String path) throws IOException {
		File file = new File(path);
		BufferedImage img = ImageIO.read(file);

		ArrayList<Integer> vector = new ArrayList<Integer>();
		for (int i = 0; i < 8; i++) {
			vector.add(0);
		}

		int h = img.getHeight();
		int w = img.getWidth();
		Color c;
		int r, ch, t;
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {
				c = new Color(img.getRGB(i, j));
				r = c.getRed();
				ch = r / 32;
				t = vector.get(ch);
				vector.set(ch, ++t);
			}
		}
		return vector;
	}

	public double getDistance(ArrayList<Integer> vector1,
			ArrayList<Integer> vector2) {
		double result = 0, temp = 0;
		for (int i = 0; i < 8; i++) {
			temp = 0;
			temp = vector1.get(i) - vector2.get(i);
			temp = Math.abs(temp);
			result = result + temp;
		}
		return result;
	}
}
