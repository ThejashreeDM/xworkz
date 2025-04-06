package com.xworkz.tileapp;
import com.xworkz.tileapp.tile.Tile;
public class TileRunner
{

        public static void display(Tile tile) {
            System.out.println("Tile ID       : " + tile.getTileId());
            System.out.println("Brand Name    : " + tile.getBrandName());
            System.out.println("Size          : " + tile.getSize());
            System.out.println("Material      : " + tile.getMaterial());
            System.out.println("Color         : " + tile.getColor());
            System.out.println("Finish        : " + tile.getFinish());
            System.out.println("Price         : " + tile.getPrice());
            System.out.println("Owner Name    : " + tile.getOwnerName());
            System.out.println();
        }

        public static void main(String[] args)
        {
            Tile tile1 = new Tile();
            tile1.setTileId(1);
            tile1.setBrandName("Kajaria");
            tile1.setSize("2x2");
            tile1.setMaterial("Ceramic");
            tile1.setColor("Beige");
            tile1.setFinish("Glossy");
            tile1.setPrice(90.00);
            tile1.setOwnerName("Rahul");
            display(tile1);

            Tile tile2 = new Tile();
            tile2.setTileId(2);
            tile2.setBrandName("Somany");
            tile2.setSize("2x4");
            tile2.setMaterial("Vitrified");
            tile2.setColor("Grey");
            tile2.setFinish("Matte");
            tile2.setPrice(110.00);
            tile2.setOwnerName("Sneha");
            display(tile2);

            Tile tile3 = new Tile();
            tile3.setTileId(3);
            tile3.setBrandName("Johnson");
            tile3.setSize("3x3");
            tile3.setMaterial("Porcelain");
            tile3.setColor("White");
            tile3.setFinish("Textured");
            tile3.setPrice(130.00);
            tile3.setOwnerName("Manoj");
            display(tile3);

            Tile tile4 = new Tile();
            tile4.setTileId(4);
            tile4.setBrandName("Nitco");
            tile4.setSize("1x1");
            tile4.setMaterial("Mosaic");
            tile4.setColor("Black");
            tile4.setFinish("Satin");
            tile4.setPrice(70.00);
            tile4.setOwnerName("Anjali");
            display(tile4);

            Tile tile5 = new Tile();
            tile5.setTileId(5);
            tile5.setBrandName("Asian Granito");
            tile5.setSize("2x3");
            tile5.setMaterial("Granite");
            tile5.setColor("Brown");
            tile5.setFinish("Glossy");
            tile5.setPrice(150.00);
            tile5.setOwnerName("Kiran");
            display(tile5);
        }
    }


