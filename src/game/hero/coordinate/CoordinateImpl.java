package game.hero.coordinate;


import game.hero.base.Hero;

import java.util.*;

public class CoordinateImpl {

    private int x = 0;
    private int y = 0;

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public CoordinateImpl(int x, int y){
        this.x = x;
        this.y = y;
    }

    public List<Hero> distanceToEnemy(Hero hero, Map<String, List<Hero>> mapTeam){
        List<Hero> heroesTeamOpp;
        List<Hero> result = new ArrayList<>();
        Set<String> key =  mapTeam.keySet();
        int minX = 10;
        int minY = 10;
        int sumCoordinateOpp = 20;

        for (String k: key) {
            if (!k.equals(hero.getTeam())){
                heroesTeamOpp = mapTeam.get(k);
                for (Hero e : heroesTeamOpp) {
                    if (hero.getCoordinate().x >= 0 && hero.getCoordinate().y >= 0) {
                        if (e.getCoordinate().x >= 0 && e.getCoordinate().y >= 0) {
                            if (Math.abs(hero.getCoordinate().x - e.getCoordinate().x)
                                    + Math.abs(hero.getCoordinate().y - e.getCoordinate().y) <= sumCoordinateOpp) {
                                sumCoordinateOpp = Math.abs(hero.getCoordinate().x - e.getCoordinate().x)
                                        + Math.abs(hero.getCoordinate().y - e.getCoordinate().y);
                                e.setCoordinateSum(sumCoordinateOpp);
                                if(!result.isEmpty()){
                                    result.sort(Comparator.comparing(Hero::getCoordinateSum));
                                    if(result.get(0).getCoordinateSum()> sumCoordinateOpp){
                                        result.remove(0);
                                        result.add(e);
                                    } else if(result.get(0).getCoordinateSum()== sumCoordinateOpp){
                                        result.add(e);
                                    }
                                }else {
                                    result.add(e);
                                }
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "CoordinateImpl{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
//    public List<Hero> distanceToEnemy(Hero hero, Map<String, List<Hero>> mapTeam){
//        List<Hero> heroesTeamOpp;
//        List<Hero> result = new ArrayList<>();
//        int[] coordinate = new int[2];
//        Set<String> key =  mapTeam.keySet();
//        int minX = 10;
//        int minY = 10;
//        int sumCoordinateOpp = 40;
//        //int sumCoordinateHero = hero.getCoordinate().x + hero.getCoordinate().y;
//
//        for (String k: key) {
//            if (!k.equals(hero.getTeam())){
//                heroesTeamOpp = mapTeam.get(k);
//                for (Hero e : heroesTeamOpp) {
//                   // if (!e.equals(hero.getName())) {
//                    if (hero.getCoordinate().x >= 0 && hero.getCoordinate().y >= 0) {
//                        if (e.getCoordinate().x >= 0 && e.getCoordinate().y >= 0) {
//                            if (Math.abs(hero.getCoordinate().x - e.getCoordinate().x)
//                                    + Math.abs(hero.getCoordinate().y - e.getCoordinate().y) < sumCoordinateOpp) {
//                                minX = e.getCoordinate().x;
//                                minY = e.getCoordinate().y;
//                                sumCoordinateOpp = Math.abs(hero.getCoordinate().x - e.getCoordinate().x)
//                                        + Math.abs(hero.getCoordinate().y - e.getCoordinate().y);
//                                System.out.println(sumCoordinateOpp+ "===");
//                                result.add(e);
//                            }
//                        } else if (e.getCoordinate().x <= 0 && e.getCoordinate().y >= 0) {
//                            if (hero.getCoordinate().x + (-(int) e.getCoordinate().x)
//                                    + Math.abs(hero.getCoordinate().y - e.getCoordinate().y)< sumCoordinateOpp) {
//                                minX = e.getCoordinate().x;
//                                minY = e.getCoordinate().y;
//                                sumCoordinateOpp = hero.getCoordinate().x + (-(int) e.getCoordinate().x)
//                                        + Math.abs(hero.getCoordinate().y - e.getCoordinate().y);
//                                        result.add(e);
//                            }
//                        } else if (e.getCoordinate().x <= 0 && e.getCoordinate().y <= 0) {
//                            if (Math.abs(-(int)hero.getCoordinate().x - e.getCoordinate().x)
//                                    + Math.abs(-(int)hero.getCoordinate().y - e.getCoordinate().y)< sumCoordinateOpp) {
//                                minX = e.getCoordinate().x;
//                                minY = e.getCoordinate().y;
//                                sumCoordinateOpp = Math.abs(-(int)hero.getCoordinate().x - e.getCoordinate().x)
//                                        + Math.abs(-(int)hero.getCoordinate().y - e.getCoordinate().y);
//                                        result.add(e);
//                            }
//                        } else if (e.getCoordinate().x >= 0 && e.getCoordinate().y < 0) {
//                            if (Math.abs(hero.getCoordinate().x - e.getCoordinate().x)
//                                    + Math.abs(-(int)hero.getCoordinate().y - e.getCoordinate().y)< sumCoordinateOpp) {
//                                minX = e.getCoordinate().x;
//                                minY = e.getCoordinate().y;
//                                sumCoordinateOpp = Math.abs(hero.getCoordinate().x - e.getCoordinate().x)
//                                        + Math.abs(-(int)hero.getCoordinate().y - e.getCoordinate().y);
//                                        result.add(e);
//
//                            }
//                        }
////                        else if (e.getCoordinate().x == 0 && e.getCoordinate().y < 0) {
////                            if (hero.getCoordinate().x
////                                    + Math.abs(-(int)hero.getCoordinate().y - e.getCoordinate().y)< sumCoordinateOpp) {
////                                if (e.getCoordinate().x < minX) {
////                                    minX = e.getCoordinate().x;
////                                    minY = e.getCoordinate().y;
////                                    result.add(e);
////                                }
////                            }
////                        } else if (e.getCoordinate().x == 0 && e.getCoordinate().y > 0) {
////                            if (hero.getCoordinate().x
////                                    + Math.abs(hero.getCoordinate().y - e.getCoordinate().y)< sumCoordinateOpp) {
////                                if (e.getCoordinate().x < minX) {
////                                    minX = e.getCoordinate().x;
////                                    minY = e.getCoordinate().y;
////                                    result.add(e);
////                                }
////                            }
////                        }
//                    }
//
//                    if (hero.getCoordinate().x <= 0 && hero.getCoordinate().y >= 0
//                            && !(hero.getCoordinate().x == 0 && hero.getCoordinate().y == 0)
//                    ) {
//                        if (e.getCoordinate().x >= 0 && e.getCoordinate().y >= 0) {
//                            if (Math.abs(-(int)hero.getCoordinate().x + e.getCoordinate().x)
//                                    + Math.abs(hero.getCoordinate().y - e.getCoordinate().y) < sumCoordinateOpp) {
//                                minX = e.getCoordinate().x;
//                                minY = e.getCoordinate().y;
//                                sumCoordinateOpp = Math.abs(-(int)hero.getCoordinate().x + e.getCoordinate().x)
//                                        + Math.abs(hero.getCoordinate().y - e.getCoordinate().y);
//                                        result.add(e);
//                            }
//                        } else if (e.getCoordinate().x <= 0 && e.getCoordinate().y >= 0) {
//                            if (Math.abs( -(int)hero.getCoordinate().x - e.getCoordinate().x)
//                                    + Math.abs(hero.getCoordinate().y - e.getCoordinate().y)< sumCoordinateOpp) {
//                                minX = e.getCoordinate().x;
//                                minY = e.getCoordinate().y;
//                                sumCoordinateOpp = Math.abs(-(int) hero.getCoordinate().x - e.getCoordinate().x)
//                                        + Math.abs(hero.getCoordinate().y - e.getCoordinate().y);
//                                        result.add(e);
//                            }
//                        } else if (e.getCoordinate().x <= 0 && e.getCoordinate().y <= 0) {
//                            if (Math.abs(-(int)hero.getCoordinate().x - e.getCoordinate().x)
//                                    + Math.abs(hero.getCoordinate().y + -(int)e.getCoordinate().y)< sumCoordinateOpp) {
//                                minX = e.getCoordinate().x;
//                                minY = e.getCoordinate().y;
//                                sumCoordinateOpp = Math.abs(-(int)hero.getCoordinate().x - e.getCoordinate().x)
//                                        + Math.abs(hero.getCoordinate().y + -(int)e.getCoordinate().y);
//                                        result.add(e);
//                            }
//                        } else if (e.getCoordinate().x >= 0 && e.getCoordinate().y < 0) {
//                            if (-(int)hero.getCoordinate().x + e.getCoordinate().x
//                                    + Math.abs(-(int)hero.getCoordinate().y - e.getCoordinate().y)< sumCoordinateOpp) {
//                                if (e.getCoordinate().x < minX) {
//                                    minX = e.getCoordinate().x;
//                                    minY = e.getCoordinate().y;
//                                    sumCoordinateOpp = -(int)hero.getCoordinate().x + e.getCoordinate().x
//                                            + Math.abs(-(int)hero.getCoordinate().y - e.getCoordinate().y);
//                                            result.add(e);
//                                }
//                            }
//                        }
//                    }
//
//                    if (hero.getCoordinate().x <= 0 && hero.getCoordinate().y <= 0
//                            && !(hero.getCoordinate().x == 0 && hero.getCoordinate().y == 0)
//                    ) {
//                        if (e.getCoordinate().x >= 0 && e.getCoordinate().y >= 0) {
//                            if (Math.abs(-(int)hero.getCoordinate().x + e.getCoordinate().x)
//                                    + Math.abs(-(int)hero.getCoordinate().y + e.getCoordinate().y) < sumCoordinateOpp) {
//                                minX = e.getCoordinate().x;
//                                minY = e.getCoordinate().y;
//                                sumCoordinateOpp = Math.abs(-(int)hero.getCoordinate().x + e.getCoordinate().x)
//                                        + Math.abs(-(int)hero.getCoordinate().y + e.getCoordinate().y);
//                                        result.add(e);
//                            }
//                        } else if (e.getCoordinate().x <= 0 && e.getCoordinate().y >= 0) {
//                            if (Math.abs( hero.getCoordinate().x - -(int)e.getCoordinate().x)
//                                    + Math.abs(-(int)hero.getCoordinate().y + e.getCoordinate().y)< sumCoordinateOpp) {
//                                minX = e.getCoordinate().x;
//                                minY = e.getCoordinate().y;
//                                sumCoordinateOpp = Math.abs( hero.getCoordinate().x - -(int)e.getCoordinate().x)
//                                        + Math.abs(-(int)hero.getCoordinate().y + e.getCoordinate().y);
//                                        result.add(e);
//                            }
//                        } else if (e.getCoordinate().x <= 0 && e.getCoordinate().y <= 0) {
//                            if (Math.abs(-(int)hero.getCoordinate().x - -(int)e.getCoordinate().x)
//                                    + Math.abs(-(int)hero.getCoordinate().y - -(int)e.getCoordinate().y)< sumCoordinateOpp) {
//                                minX = e.getCoordinate().x;
//                                minY = e.getCoordinate().y;
//                                sumCoordinateOpp = Math.abs(-(int)hero.getCoordinate().x - -(int)e.getCoordinate().x)
//                                        + Math.abs(-(int)hero.getCoordinate().y - -(int)e.getCoordinate().y);
//                                        result.add(e);
//                            }
//                        } else if (e.getCoordinate().x >= 0 && e.getCoordinate().y < 0) {
//                            if (Math.abs(-(int)hero.getCoordinate().x + e.getCoordinate().x)
//                                    + Math.abs(-(int)hero.getCoordinate().y - -(int)e.getCoordinate().y)< sumCoordinateOpp) {
//                                if (e.getCoordinate().x < minX) {
//                                    minX = e.getCoordinate().x;
//                                    minY = e.getCoordinate().y;
//                                    sumCoordinateOpp = Math.abs(-(int)hero.getCoordinate().x + e.getCoordinate().x)
//                                            + Math.abs(-(int)hero.getCoordinate().y - -(int)e.getCoordinate().y);
//                                            result.add(e);
//                                }
//                            }
//                        }
//                    }
//
//                    if (hero.getCoordinate().x >= 0 && hero.getCoordinate().y <= 0
//                            && !(hero.getCoordinate().x == 0 && hero.getCoordinate().y == 0)
//                    ) {
//                        if (e.getCoordinate().x >= 0 && e.getCoordinate().y >= 0) {
//                            if (Math.abs(hero.getCoordinate().x - e.getCoordinate().x)
//                                    + Math.abs(-(int)hero.getCoordinate().y + e.getCoordinate().y) < sumCoordinateOpp) {
//                                minX = e.getCoordinate().x;
//                                minY = e.getCoordinate().y;
//                                sumCoordinateOpp = Math.abs(hero.getCoordinate().x - e.getCoordinate().x)
//                                        + Math.abs(-(int)hero.getCoordinate().y + e.getCoordinate().y);
//                                        result.add(e);
//                            }
//                        } else if (e.getCoordinate().x <= 0 && e.getCoordinate().y >= 0) {
//                            if (hero.getCoordinate().x + -(int)e.getCoordinate().x
//                                    + Math.abs(-(int)hero.getCoordinate().y + e.getCoordinate().y)< sumCoordinateOpp) {
//                                minX = e.getCoordinate().x;
//                                minY = e.getCoordinate().y;
//                                sumCoordinateOpp = hero.getCoordinate().x + -(int)e.getCoordinate().x
//                                        + Math.abs(-(int)hero.getCoordinate().y + e.getCoordinate().y);
//                                        result.add(e);
//                            }
//                        } else if (e.getCoordinate().x <= 0 && e.getCoordinate().y <= 0) {
//                            if (Math.abs(hero.getCoordinate().x + -(int)e.getCoordinate().x)
//                                    + Math.abs(-(int)hero.getCoordinate().y - e.getCoordinate().y)< sumCoordinateOpp) {
//                                minX = e.getCoordinate().x;
//                                minY = e.getCoordinate().y;
//                                sumCoordinateOpp = Math.abs(hero.getCoordinate().x + -(int)e.getCoordinate().x)
//                                        + Math.abs(-(int)hero.getCoordinate().y - e.getCoordinate().y);
//                                        result.add(e);
//                            }
//                        } else if (e.getCoordinate().x >= 0 && e.getCoordinate().y < 0) {
//                            if (Math.abs(-(int)hero.getCoordinate().x + e.getCoordinate().x)
//                                    + Math.abs(-(int)hero.getCoordinate().y + e.getCoordinate().y)< sumCoordinateOpp) {
//                                if (e.getCoordinate().x < minX) {
//                                    minX = e.getCoordinate().x;
//                                    minY = e.getCoordinate().y;
//                                    sumCoordinateOpp = Math.abs(-(int)hero.getCoordinate().x + e.getCoordinate().x)
//                                            + Math.abs(-(int)hero.getCoordinate().y + e.getCoordinate().y);
//                                            result.add(e);
//                                }
//                            }
//                        }
//                    }
//                    //}
//                }
//            }
//        }
//
//        if(hero != null) {
//            coordinate[0] = minX;
//            coordinate[1] = minY;
//            //System.out.println("Минимальные координаты : " + Arrays.toString(coordinate));
//        }
//        return result;
//    }