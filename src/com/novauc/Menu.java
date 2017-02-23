package com.novauc;

/**
 * Created by vtcurry on 2/23/17.
 */
public class Menu {

    public String steak;
    public String seasonning;
    public int size;
    public String side;
    public boolean lobster;

        public Menu (String steak, String seasonning, int size, String side, boolean lobster){

            this.steak = steak;
            this.seasonning = seasonning;
            this.size = size;
            this.side = side;
            this.lobster = lobster;

        }

        public String getSteak() {
            return steak;
        }

        public void setSteak(String steak) {
            this.steak = steak;
        }

        public String getSeasonning() {
            return seasonning;
        }

        public void setSeasonning(String seasonning) {
            this.seasonning = seasonning;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public String getSide() {
            return side;
        }

        public void setSide(String side) {
            this.side = side;
        }

        public boolean isLobster() {
            return lobster;
        }

        public void setLobster(boolean lobster) {
            this.lobster = lobster;
        }

        public String toString(){
            return String.format(
                    "steak: " + steak + "\n"
                            + "seasonning: " + seasonning +  "\n"
                            + "size: " + size + "\n"
                            + "side: " + side + "\n"
                            + "lobster: " + lobster );
        }

    }
