import java.util.Random;

public class main
{
    private static MyRectangle makeDrop() {
        Random r = new Random();
        int x =r.nextInt(0, 800);
        int y = r.nextInt(0, 25);
        MyRectangle c = new MyRectangle(x, y);
        c.makeVisible();
        c.moveHorizontal(x);
        
        for (int j = 0; j < 5; j++) {
            c.slowMoveVertical(3);
        }

        return c;
    }

    private static Square makeSlash(int startX, int startY, int size, boolean right) {
        Square lastB = new Square(0,0, "black");
        for(int i = 1; i <= size; i ++) {
            int xPos = startX + (i * 5);
            int yPos = 0;
            if(right)
                yPos = startY + (i * 5);
            else
                yPos = startY - (i * 5);
            Square b = new Square(xPos,yPos, "green");
            lastB = b;
        }
        return lastB;
    }
    
    private static Square makeHifen(int startX, int startY, int size, boolean vertical) {
        Square lastB = new Square(startX,startY, "green");
        for(int i = 1; i <= size; i ++) {
            int xPos = startX;
            int yPos = startY;
            if(vertical)
                yPos = startY - (i * 5);
            else
                xPos = startX - (i * 5);
            lastB = new Square(xPos,yPos, "green");
        }
        return lastB;
    }

    private static MyRectangle m(int startX, int startY) {
        MyRectangle a = new MyRectangle(startX, startY);
        Square lastA = makeSlash(a.xPosition, a.yPosition, 4, true);        
        Square lastB = makeSlash(lastA.xPosition, lastA.yPosition, 4, false);
        MyRectangle b = new MyRectangle(lastB.xPosition, lastB.yPosition);

        return b;
    }

    private static Square a(int startX, int startY) {
        Square lastA = makeSlash(startX, startY, 7, false);        
        Square lastB = makeSlash(lastA.xPosition - 1, lastA.yPosition - 1, 7, true);
    return lastB;
    }
    
    private static Square T1(int startX, int startY) {
        Square lastS = makeHifen(startX, startY, 7, true);
        return lastS;
    }
    
    private static Square T2 (int startX, int startY) {
        Square lastS = makeHifen(startX, startY, 7, false);
        return lastS;
    }
    
    private static Square R1 (int startX, int startY) {
        Square lastS = makeHifen(startX, startY, 7, true);
        return lastS;
    }
    
    private static Square R2(int startX, int startY) {
        Square lastS = new Square(startX, startY, "green");
        lastS.changeSize(20);
        return lastS;
    }
    
    private static Square R3 (int startX, int startY) {
        Square lastS = makeSlash(startX, startY, 3, true);
        return lastS;
    }
    
    private static Square I (int startX, int startY) {
        Square lastS = makeHifen(startX, startY, 7, true);
        return lastS;
    
    }
    
    private static Square fX(int startX, int startY) {
        Square lastS = makeSlash(startX, startY, 7, true);
        return lastS;
    }
    
    private static Square lX(int startX, int startY) {
        Square lastS = makeSlash(startX, startY, 7, false);
        return lastS;
    }

    private static void plotMatrix(int startX, int startY) {
        MyRectangle fl = m(120, 120);
        Square lastA = a(fl.xPosition + fl.sizeX, fl.yPosition + fl.sizeY);
        Square lastT1 = T1(lastA.xPosition, lastA.yPosition);
        Square lastT2 = T2(lastT1.xPosition + ((lastT1.size * 7) / 2), lastT1.yPosition);
        Square lastR1 = R1(lastT2.xPosition + (lastT2.size * 7), (lastT2.yPosition + (lastT2.size*7)));
        Square lastR2 = R2(lastR1.xPosition + (lastR1.size), lastR1.yPosition);
        Square lastR3 = R3(lastR1.xPosition + lastR1.size, lastR2.yPosition + ((lastR1.size * 7)/2) - 1);
        Square lastI = I(lastR3.xPosition + (lastR3.size * 2), lastR3.yPosition);
        Square firstX = fX(lastI.xPosition + 5, lastI.yPosition);
        Square lastX = lX(lastI.xPosition + 5, firstX.yPosition);
    }

    public static void main(String args[]) {

        
            plotMatrix(160, 190);
            
        for (int i = 0; i < 1000; i++) {
            makeDrop();
            
        }
    }
}