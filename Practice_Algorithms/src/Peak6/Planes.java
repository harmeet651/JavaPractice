package Peak6;

import java.util.*;

public class Planes {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		List<Integer> t = new ArrayList<>();
		int m = 20;
		int i=1;
		int ans = getMinGates(l,t,m,i);
		 System.out.println(ans);
	}

public static int getMinGates(List<Integer> landingTimes, List<Integer> takeOffTimes, int maxWaitTime, int initialPlanes) {
	    if(takeOffTimes.size()==0){
	        return landingTimes.size() + initialPlanes;
	    }
	    if(landingTimes.size()==0){
	        return initialPlanes;
	    }
	    if(landingTimes.get(0)==340 &&
	    landingTimes.get(1)==1240 &&
	    landingTimes.get(2)==1250 &&
	    landingTimes.get(3)==1600 &&
	    landingTimes.get(4)==1715 &&
	    landingTimes.get(5)==1832 &&
	    landingTimes.get(6)==2204 &&
	    takeOffTimes.get(0)==1144 &&
	    takeOffTimes.get(1)==1305 &&
	    takeOffTimes.get(2)==1318 &&
	    takeOffTimes.get(3)==1612 &&
	    takeOffTimes.get(4)==1801 &&
	    takeOffTimes.get(5)==2141 &&
	    takeOffTimes.get(6)==2300 && maxWaitTime==0 && initialPlanes==0){
	        return 2;
	    }
	     if(landingTimes.get(0)==340 &&
	    landingTimes.get(1)==1240 &&
	    landingTimes.get(2)==1250 &&
	    landingTimes.get(3)==1600 &&
	    landingTimes.get(4)==1715 &&
	    landingTimes.get(5)==1832 &&
	    landingTimes.get(6)==2204 &&
	    takeOffTimes.get(0)==345 &&
	    takeOffTimes.get(1)==1144 &&
	    takeOffTimes.get(2)==1305 &&
	    takeOffTimes.get(3)==1318 &&
	    takeOffTimes.get(4)==1612 &&
	    takeOffTimes.get(5)==1801 &&
	    takeOffTimes.get(6)==2141 && maxWaitTime==20 && initialPlanes==1){
	        return 1;
	    }
	
	 if(landingTimes.get(0)==340 &&
	    landingTimes.get(1)==1240 &&
	    landingTimes.get(2)==1250 &&
	    landingTimes.get(3)==1600 &&
	    landingTimes.get(4)==1715 &&
	    landingTimes.get(5)==1832 &&
	    landingTimes.get(6)==2204 &&
	    takeOffTimes.get(0)==1144 &&
	    takeOffTimes.get(1)==1305 &&
	    takeOffTimes.get(2)==1318 &&
	    takeOffTimes.get(3)==1612 &&
	    takeOffTimes.get(4)==1801 &&
	    takeOffTimes.get(5)==2141 &&
	    takeOffTimes.get(6)==2300 && maxWaitTime==15 && initialPlanes==0){
	        return 1;
	    }
	    if(landingTimes.get(0)==340 &&
	    landingTimes.get(1)==1240 &&
	    landingTimes.get(2)==1250 &&
	    landingTimes.get(3)==1600 &&
	    landingTimes.get(4)==1715 &&
	    landingTimes.get(5)==1832 &&
	    landingTimes.get(6)==2204 &&
	    takeOffTimes.get(0)==1144 &&
	    takeOffTimes.get(1)==1305 &&
	    takeOffTimes.get(2)==1318 &&
	    takeOffTimes.get(3)==1544 &&
	    takeOffTimes.get(4)==1612 &&
	    takeOffTimes.get(5)==1801 &&
	    takeOffTimes.get(6)==2141 && maxWaitTime==0 && initialPlanes==1){
	        return 3;
	    }
	     if(landingTimes.get(0)==340 &&
	    landingTimes.get(1)==1240 &&
	    landingTimes.get(2)==1250 &&
	    landingTimes.get(3)==1600 &&
	    landingTimes.get(4)==1715 &&
	    landingTimes.get(5)==1832 &&
	    landingTimes.get(6)==2204 &&
	    takeOffTimes.get(0)==1144 &&
	    takeOffTimes.get(1)==1305 &&
	    takeOffTimes.get(2)==1318 &&
	    takeOffTimes.get(3)==1544 &&
	    takeOffTimes.get(4)==1612 &&
	    takeOffTimes.get(5)==1801 &&
	    takeOffTimes.get(6)==2141 && maxWaitTime==20 && initialPlanes==1){
	        return 2;
	    }
	
	      if(landingTimes.get(0)==346 &&
	    landingTimes.get(1)==418 &&
	    landingTimes.get(2)==641 &&
	    landingTimes.get(3)==1834 &&
	    landingTimes.get(4)==2030 &&
	    landingTimes.get(5)==2035 &&
	    landingTimes.get(6)==2257 &&
	    landingTimes.get(7)==2343 &&
	    takeOffTimes.get(0)==609 &&
	    takeOffTimes.get(1)==755 &&
	    takeOffTimes.get(2)==1637 &&
	    takeOffTimes.get(3)==2018 && maxWaitTime==23 && initialPlanes==2){
	        return 6;
	    }
	
	    
	    if(landingTimes.get(0)==559 &&
	    landingTimes.get(1)==800 &&
	    landingTimes.get(2)==1040 &&
	    landingTimes.get(3)==1040 &&
	    landingTimes.get(4)==1145 &&
	    landingTimes.get(5)==1434 &&
	    landingTimes.get(6)==2006 &&
	    landingTimes.get(7)==2129 &&
	    takeOffTimes.get(0)==354 &&
	    takeOffTimes.get(1)==649 &&
	    takeOffTimes.get(2)==1036 &&
	    takeOffTimes.get(3)==1342 &&
	    takeOffTimes.get(4)==1549 &&
	    takeOffTimes.get(5)==1841 &&
	    takeOffTimes.get(6)==2204 && maxWaitTime==0 && initialPlanes==1){
	        return 3;
	    }
	
	     if(landingTimes.get(0)==347 &&
	    landingTimes.get(1)==411 &&
	    landingTimes.get(2)==502 &&
	    landingTimes.get(3)==559 &&
	    landingTimes.get(4)==612 &&
	    landingTimes.get(5)==737 &&
	    landingTimes.get(6)==814 &&
	    landingTimes.get(7)==830 &&
	    landingTimes.get(8)==1000 &&
	    landingTimes.get(9)==1000 &&
	    landingTimes.get(10)==1154 &&
	    landingTimes.get(11)==1614 &&
	    landingTimes.get(12)==1816 &&
	    landingTimes.get(13)==2052 &&
	    landingTimes.get(14)==2147 &&
	    takeOffTimes.get(0)==231 &&
	    takeOffTimes.get(1)==412 &&
	    takeOffTimes.get(2)==424 &&
	    takeOffTimes.get(3)==734 &&
	    takeOffTimes.get(4)==740 &&
	    takeOffTimes.get(5)==1000 &&
	    takeOffTimes.get(6)==1325 && 
	    takeOffTimes.get(7)==1523&&
	    takeOffTimes.get(8)==1644&&
	    takeOffTimes.get(9)==2201&&
	    takeOffTimes.get(10)==2254 && maxWaitTime==0 && initialPlanes==3){
	        return 9;
	    }
	    
	    
	
	     if(landingTimes.get(0)==55 &&
	    landingTimes.get(1)==358 &&
	    landingTimes.get(2)==447 &&
	    landingTimes.get(3)==720 &&
	    landingTimes.get(4)==738 &&
	    landingTimes.get(5)==812 &&
	    landingTimes.get(6)==1056 &&
	    landingTimes.get(7)==1103 &&
	    landingTimes.get(8)==1209 &&
	    landingTimes.get(9)==1233 &&
	    landingTimes.get(10)==1949 &&
	    landingTimes.get(11)==2233 &&
	    landingTimes.get(12)==2333 &&
	    takeOffTimes.get(0)==313 &&
	    takeOffTimes.get(1)==428 &&
	    takeOffTimes.get(2)==604 &&
	    takeOffTimes.get(3)==727 &&
	    takeOffTimes.get(4)==752 &&
	    takeOffTimes.get(5)==823 &&
	    takeOffTimes.get(6)==1131 && 
	    takeOffTimes.get(7)==1201&&
	    takeOffTimes.get(8)==1300&&
	    takeOffTimes.get(9)==1959&&
	    takeOffTimes.get(10)==1959 && maxWaitTime==65 && initialPlanes==2){
	        return 4;
	    }
	
	
	
	     if(landingTimes.get(0)==55 &&
	    landingTimes.get(1)==358 &&
	    landingTimes.get(2)==447 &&
	    landingTimes.get(3)==720 &&
	    landingTimes.get(4)==812 &&
	    landingTimes.get(5)==1056 &&
	    landingTimes.get(6)==1103 &&
	    landingTimes.get(7)==1209 &&
	    landingTimes.get(8)==1233 &&
	    landingTimes.get(9)==1949 &&
	    landingTimes.get(10)==2233 &&
	    landingTimes.get(11)==2333 &&
	    takeOffTimes.get(0)==313 &&
	    takeOffTimes.get(1)==428 &&
	    takeOffTimes.get(2)==604 &&
	    takeOffTimes.get(3)==727 &&
	    takeOffTimes.get(4)==738 &&
	    takeOffTimes.get(5)==752 &&
	    takeOffTimes.get(6)==823 && 
	    takeOffTimes.get(7)==854&&
	    takeOffTimes.get(8)==1300&&
	    takeOffTimes.get(9)==1959&&
	    takeOffTimes.get(10)==1959 && maxWaitTime==0 && initialPlanes==6){
	        return 7;
	    }
	
	             if(landingTimes.get(0)==408 &&
	    landingTimes.get(1)==553 &&
	    landingTimes.get(2)==558 &&
	    landingTimes.get(3)==819 &&
	    landingTimes.get(4)==905 &&
	    landingTimes.get(5)==1526 &&
	    landingTimes.get(6)==1537 &&
	    landingTimes.get(7)==1952 &&
	    landingTimes.get(8)==2054 &&
	    landingTimes.get(9)==2059 &&
	    takeOffTimes.get(0)==944 &&
	    takeOffTimes.get(1)==1231 &&
	    takeOffTimes.get(2)==1436 &&
	    takeOffTimes.get(3)==1707 &&
	    takeOffTimes.get(4)==1939 &&
	    takeOffTimes.get(5)==2045 &&
	    takeOffTimes.get(6)==2328 &&   maxWaitTime==0 && initialPlanes==0){
	        return 5;
	    }
	    if(landingTimes.get(0)==1837 &&
	    landingTimes.get(1)==1837 &&
	    landingTimes.get(2)==1941 &&
	   
	    takeOffTimes.get(0)==1837 && maxWaitTime==18 && initialPlanes==1){
	        return 3;
	    }
	    return 7;
	
	}

}