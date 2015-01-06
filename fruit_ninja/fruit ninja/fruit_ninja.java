import java.io.*;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class fruit_ninja extends Applet implements MouseListener,MouseMotionListener{
	int movx,movy,mousex,mousey;
	Image orange,orange1,orange2,citron,citron1,citron2,watermilon,watermilon1,watermilon2,strawberry,strawberry1,strawberry2,life,bomb;
	int x,y,i,j,xo,yo,i1,xw,yw,iw,xs,ys,is;
	int xb,yb,ib,xb1,xb2,yb1,yb2;
	int score=0;
	boolean flag=false;
	Random no=new Random();
	boolean e=false;
	public void init()
	{
		orange = getImage(getDocumentBase(),getParameter("orange"));
		orange1 = getImage(getDocumentBase(),getParameter("orange1"));
		orange2 = getImage(getDocumentBase(),getParameter("orange2"));
		citron = getImage(getDocumentBase(),getParameter("citron"));
		citron1 = getImage(getDocumentBase(),getParameter("citron1"));
		citron2 = getImage(getDocumentBase(),getParameter("citron2"));
		watermilon = getImage(getDocumentBase(),getParameter("watermilon"));
		watermilon1 = getImage(getDocumentBase(),getParameter("watermilon1"));
		watermilon2 = getImage(getDocumentBase(),getParameter("watermilon2"));
		strawberry = getImage(getDocumentBase(),getParameter("strawberry"));
		strawberry1 = getImage(getDocumentBase(),getParameter("strawberry1"));
		strawberry2 = getImage(getDocumentBase(),getParameter("strawberry2"));
		life = getImage(getDocumentBase(),getParameter("life"));
		bomb = getImage(getDocumentBase(),getParameter("bomb"));
		f=new Font("Dialog",Font.PLAIN,50);
		setFont(f);
		setForeground(Color.red);
		x=150;
		y=750;
		i=750;
		i1=750;
		xo=600;
		yo=750;
		iw=750;
		xw=50;
		yw=750;
		is=750;
		xs=700;
		ys=750;
		ib=750;
		xb=375;
		yb=750;
		//setBackground(Color.black);
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	int d=1,count=3;
	Font f;
	String msg="Hello";
	int x1,x2,y1,y2;
	int x3,x4,y3,y4;
	int x5,x6,y5,y6;
	int x7,x8,y7,y8;
	boolean flag1=false;
	boolean flag2=false;
	boolean flag3=false;
	boolean flagb1=false,flagb2=false;
	boolean flags1=false,flags2=false;
	boolean flagw1=false,flagw2=false;
	public void paint(Graphics g)
	{
	if(e==false)
	{
		
		/*ORANGE*/		

		if(flag)
		{
			
			flag1=true;
			flag=false;
			
			x1=x;
			x2=x+68;
			y1=y;
			y2=y;
		}
		else if(flag1)
		{
			if(y1<700)
			{
				x1-=10;
				y1+=30;
				x2+=10;
				y2+=30;
				i++;
				g.drawImage(orange2,x2,y2,this);
				g.drawImage(orange1,x1,y1,this);
				
			}
			else{
			flag1=false;
			score+=10;

			while((x=(no.nextInt()))<0);
			x=x%900;
			y=680;
			i=680;
			}
			
		}
		else{
			g.drawImage(orange,x,y,this);
			g.drawString(score+"",1250,50);
		
			
			
			if(i>0)
			{
			
				
				y=y-(1);
				i--;
			
			}
			else{
				while((x=(no.nextInt()))<0);
				x=x%900;
				y=680;
				//g.drawString(x+","+y ,0,10);
				i=680;
			}
		repaint();
		
		/*CITRON*/		

		if(flag2)
		
		{	
			flag3=true;
			flag2=false;
			
			x3=xo;
			x4=xo+68;
			y3=yo;
			y4=yo;
		}
		else if(flag3)
		{
			if(y3<700)
			{
				x3-=10;
				y3+=30;
				x4+=10;
				y4+=30;
				i1++;
				g.drawImage(citron1,x4,y4,this);
				g.drawImage(citron2,x3,y3,this);
				
			}
			else{
			flag3=false;
			score+=10;

			while((xo=(no.nextInt()))<0);
			xo=xo%900;
			yo=680;
			i1=680;
			while((xo=(no.nextInt()))<0);
			xo=xo%900;
			yo=680;
			}
			
		}
		else{
			g.drawImage(citron,xo,yo,this);
			g.drawString(score+"",1250,50);
		
			
			
			if(i1>0)
			{
			
			
				yo=yo-(1);
				i1--;
			
			}
			else{
				while((xo=(no.nextInt()))<0);
				xo=xo%900;
				yo=680;
				//g.drawString(x0+","+y0 ,0,10);
				i1=680;
			}
		
		}

		/*WATERMILON*/

		if(flagw1)
		
		{	
			flagw2=true;
			flagw1=false;
			
			x5=xw;
			x6=xw+68;
			y5=yw;
			y6=yw;
		}
		else if(flagw2)
		{
			if(y5<700)
			{
				x5-=10;
				y5+=30;
				x6+=10;
				y6+=30;
				iw++;
				g.drawImage(watermilon1,x6,y6,this);
				g.drawImage(watermilon2,x5,y5,this);
				
			}
			else{
			flagw2=false;
			score+=10;

			while((xw=(no.nextInt()))<0);
			xw=xw%900;
			yw=680;
			iw=680;
			while((xw=(no.nextInt()))<0);
			xw=xw%900;
			yw=680;
			}
			
		}
		else{
			g.drawImage(watermilon,xw,yw,this);
			g.drawString(score+"",1250,50);
		
			
			
			if(iw>0)
			{
			
			
				yw=yw-(1);
				iw--;
			
			}
			else{
				while((xw=(no.nextInt()))<0);
				xw=xw%900;
				yw=680;
				//g.drawString(x0+","+y0 ,0,10);
				iw=680;
			}
		
	   	}		

		/*STRAWBERRY*/

		if(flags1)
		
		{	
			flags2=true;
			flags1=false;
			
			x7=xs;
			x8=xs+68;
			y7=ys;
			y8=ys;
		}
		else if(flags2)
		{
			if(y7<700)
			{
				x7-=10;
				y7+=30;
				x8+=10;
				y8+=30;
				is++;
				g.drawImage(strawberry1,x8,y8,this);
				g.drawImage(strawberry2,x7,y7,this);
				
			}
			else{
			flags2=false;
			score+=10;

			while((xs=(no.nextInt()))<0);
			xs=xs%900;
			ys=680;
			is=680;
			while((xs=(no.nextInt()))<0);
			xs=xs%900;
			ys=680;
			}
			
		}
		else{
			g.drawImage(strawberry,xs,ys,this);
			g.drawString(score+"",1250,50);
		
			
			
			if(is>0)
			{
			
			
				ys=ys-(1);
				is--;
			
			}
			else{
				while((xs=(no.nextInt()))<0);
				xs=xs%900;
				ys=680;
				//g.drawString(x0+","+y0 ,0,10);
				is=680;
			}
		
	   	}	


		/*BOMB*/
		
		}
		if(flagb1)
		{
			
			flagb2=true;
			flagb1=false;
			xb1=xb;
			xb2=xb+68;
			yb1=yb;
			yb2=yb;
		}
		else if(flagb2)
		{
			if(yb1<700)
			{
				xb1-=10;
				yb1+=30;
				xb2+=10;
				yb2+=30;
				ib++;
				//count--;
				//g.drawImage(img2,x2,y2,this);
				//g.drawImage(img1,x1,y1,this);
				
			}
			else{
			flagb2=false;
			score-=20;
			count--;
			while((xb=(no.nextInt()))<0);
			xb=xb%900;
			yb=680;
			ib=680;
			}
			
		}
		else{
			g.drawImage(bomb,xb,yb,this);
			g.drawString(score+"",1250,50);
		
			
			if(ib>0)
			{
			
			
				yb=yb-(1);
				ib--;
			
			}
			else{
				while((xb=(no.nextInt()))<0);
				xb=x%900;
				yb=680;
				//g.drawString(xb+","+yb ,0,10);
				ib=680;
			}
		}
		repaint();
		if(count==3)
		{
			g.drawImage(life,1200,500,this);
			g.drawImage(life,1250,500,this);
			g.drawImage(life,1300,500,this);
			repaint();
		}
		if(count==2)
		{
			g.drawImage(life,1250,500,this);
			g.drawImage(life,1300,500,this);
			repaint();
		}
		if(count==1)
		{
			g.drawImage(life,1300,500,this);
			repaint();
		}
		if(count==0)
		{
			repaint();
		}
		if(count==-1)
		{
		repaint();
		f=new Font("Dialog",Font.PLAIN,60);
		setFont(f);
		g.drawString("GAME OVER",500,350);
		for(j=0;j<50000000;j++)
		{
		}
		e=true;
		}
			for(j=0;j<5000000;j++)
			{
			}
				
		repaint();
		
		}
			
	}
	
	
	public void mouseEntered(MouseEvent me)
	{
		//mousex=0;
		//mousey=24;
		//repaint();
	}
	public void mouseExited(MouseEvent me)
	{
		//movx=me.getX();
		//movy=me.getY();
		//repaint();
	}
	public void mouseReleased(MouseEvent me)
	{
		//movx=me.getX();
		//movy=me.getY();
		//repaint();
	}
	public void mousePressed(MouseEvent me)
	{
		//movx=me.getX();
		//movy=me.getY();
		//repaint();
	}
	public void mouseClicked(MouseEvent me)
	{
		//movx=me.getX();
		//movy=me.getY();
		//repaint();
	}
	public void mouseMoved(MouseEvent me)
	{
		//movx=me.getX();
		//movy=me.getY();
		//repaint();
		
		/*ORANGE*/
		
		movx=me.getX();
		movy=me.getY();
		if((movx>x && movx<(x+50)) && (movy>y && movy<(y+65)))
		{
			flag=true;
			//repaint();
		}
		
		/*CITRON*/
	
		movx=me.getX();
		movy=me.getY();
		if((movx>xo && movx<(xo+50)) && (movy>yo && movy<(yo+65)))
		{
			flag2=true;
			//repaint();
		}
		
		/*WATERMILON*/
		
		movx=me.getX();
		movy=me.getY();
		if((movx>xw && movx<(xw+50)) && (movy>yw && movy<(yw+65)))
		{
			flagw1=true;
			//repaint();
		}
		
		/*STRAWBERRY*/
		
		movx=me.getX();
		movy=me.getY();
		if((movx>xs && movx<(xs+50)) && (movy>ys && movy<(ys+65)))
		{
			flags1=true;
			//repaint();
		}

		/*BOMB*/
		
		movx=me.getX();
		movy=me.getY();
		if((movx>xb && movx<(xb+50)) && (movy>yb && movy<(yb+65)))
		{
			flagb1=true;
			//repaint();
		}
	}
	public void mouseDragged(MouseEvent me)
	{
		//movx=me.getX();
		//movy=me.getY();
		//repaint();	
	}
}

/*<applet code="fruit_ninja" height=768 width=1366>
<param name="orange" value="orange.jpg">
<param name="orange1" value="orange1.jpg">
<param name="orange2" value="orange2.jpg">
<param name="citron" value="citron.jpg">
<param name="citron1" value="citron1.jpg">
<param name="citron2" value="citron2.jpg">
<param name="watermilon" value="watermilon.jpg">
<param name="watermilon1" value="watermilon1.jpg">
<param name="watermilon2" value="watermilon2.jpg">
<param name="strawberry" value="strawberry.jpg">
<param name="strawberry1" value="strawberry1.jpg">
<param name="strawberry2" value="strawberry2.jpg">
<param name="life" value="life.jpg">
<param name="bomb" value="bomb.jpg">
</applet>*/
