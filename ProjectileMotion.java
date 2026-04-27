import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProjectileMotion {
    static int positionX = -120;
    static int positionY = 350;
    static int positionXBall2 = 25;
    static int positionYBall2 = 300;
    static int positionXBall3 = 100;
    static int positionYBall3 = 300;
    static int positionXBall4 = 100;
    static int positionYBall4 = 300;
    static int ball2Width = 320;
    static int ball2Height = 320;
    static int ball3Width = 190;
    static int ball3Height = 190;
    static int ball4Width = 275;
    static int ball4Height = 275;
    static double massBall1 = 5.00;
    static double massBall2 = 10.00;
    static double massBall3 = 15.00;
    static double massBall4 = 20.00;
    static double velocityX, velocityY, gravity, angleThetaInitial, angleThetaY, angleThetaX, initialVelocity,
            angleThetaYBall2, angleThetaXBall2, velocityXBall2, velocityYBall2, angleThetaInitialBall2,
            angleThetaInitialBall3, angleThetaInitialBall4, velocityXBall3, velocityYBall3, velocityXBall4,
            velocityYBall4, angleThetaYBall3, angleThetaXBall3, angleThetaXBall4, angleThetaYBall4;
    static int ballHeight, ballWidth;
    static ImageIcon ballIcon, imageIconBall2, iconBall2, imageIconBall3, imageIconBall4, iconBall3, iconBall4;
    static Image imageBall2, scaledImageBall2, imageBall3, imageBall4, scaledImageBall3, scaledImageBall4;
    static JLabel ball, ball2, ball3, ball4;
    static JPanel mainPanel;
    static JFrame frame;
    static Timer timer;

    public static void main(String[] args) {
        frame = new JFrame("Projectile Motion Simulation");
        frame.setLayout(null);

        ballIcon = new ImageIcon(
                "ball.png");
        ball = new JLabel(ballIcon);

        imageIconBall2 = new ImageIcon(
                "ball2.png");
        imageBall2 = imageIconBall2.getImage();
        scaledImageBall2 = imageBall2.getScaledInstance(ball2Width, ball2Height, Image.SCALE_SMOOTH);
        iconBall2 = new ImageIcon(scaledImageBall2);

        ball2 = new JLabel();
        ball2.setIcon(iconBall2);
        ball2.setBounds(25, 300, ball2Width, ball2Height);

        imageIconBall3 = new ImageIcon(
                "ball3.png");
        imageBall3 = imageIconBall3.getImage();
        scaledImageBall3 = imageBall3.getScaledInstance(ball3Width, ball3Height, Image.SCALE_SMOOTH);
        iconBall3 = new ImageIcon(scaledImageBall3);

        ball3 = new JLabel();
        ball3.setIcon(iconBall3);
        ball3.setBounds(89, 380, ball3Width, ball3Height);

        imageIconBall4 = new ImageIcon(
                "ball4.png");
        imageBall4 = imageIconBall4.getImage();
        scaledImageBall4 = imageBall4.getScaledInstance(ball4Width, ball4Height, Image.SCALE_SMOOTH);
        iconBall4 = new ImageIcon(scaledImageBall4);

        ball4 = new JLabel();
        ball4.setIcon(iconBall4);
        ball4.setBounds(43, 335, ball4Width, ball4Height);

        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(new Color(0, 0, 0));
        mainPanel.add(ball2);
        mainPanel.add(ball3);
        mainPanel.add(ball4);
        mainPanel.add(ball);

        ballHeight = ballIcon.getIconHeight() - 20;
        ballWidth = ballIcon.getIconWidth() - 20;

        ball.setBounds(-120, 500, ballWidth, ballHeight);

        gravity = 9.8;
        angleThetaInitial = 22.5;
        angleThetaInitialBall2 = 45;
        angleThetaInitialBall3 = 67.5;
        angleThetaInitialBall4 = 90.0;
        initialVelocity = 9.00;

        angleThetaY = Math.sin(Math.toRadians(angleThetaInitial));
        angleThetaX = Math.cos(Math.toRadians(angleThetaInitial));

        angleThetaYBall2 = Math.sin(Math.toRadians(angleThetaInitialBall2));
        angleThetaXBall2 = Math.cos(Math.toRadians(angleThetaInitialBall2));

        angleThetaYBall3 = Math.sin(Math.toRadians(angleThetaInitialBall3));
        angleThetaXBall3 = Math.cos(Math.toRadians(angleThetaInitialBall3));

        angleThetaYBall4 = Math.sin(Math.toRadians(angleThetaInitialBall4));
        angleThetaXBall4 = Math.cos(Math.toRadians(angleThetaInitialBall4));

        velocityX = initialVelocity * angleThetaX;
        velocityY = initialVelocity * angleThetaY;

        velocityXBall2 = initialVelocity * angleThetaXBall2;
        velocityYBall2 = initialVelocity * angleThetaYBall2;

        velocityXBall3 = initialVelocity * angleThetaXBall3;
        velocityYBall3 = initialVelocity * angleThetaYBall3;

        velocityXBall4 = initialVelocity * angleThetaXBall4;
        velocityYBall4 = initialVelocity * angleThetaYBall4;

        frame.setContentPane(mainPanel);
        frame.setSize(1200, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);

        timer = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (positionY > 350) {
                    velocityX = 0;
                    velocityY = 0;

                    positionX += (int) velocityX;
                    positionY -= (int) velocityY;

                    ball.setLocation(positionX, positionY);
                }

                if (positionYBall2 > 300) {
                    velocityXBall2 = 0;
                    velocityYBall2 = 0;

                    positionXBall2 += (int) velocityXBall2;
                    positionYBall2 -= (int) velocityYBall2;

                    ball2.setLocation(positionXBall2, positionYBall2);
                }

                if (positionYBall3 > 380) {
                    velocityXBall3 = 0;
                    velocityYBall3 = 0;

                    positionXBall3 += (int) velocityXBall3;
                    positionYBall3 -= (int) velocityYBall3;

                    ball3.setLocation(positionXBall3, positionYBall3);
                }

                if (positionYBall4 > 335) {
                    velocityXBall4 = 0;
                    velocityYBall4 = 0;

                    positionXBall4 += (int) velocityXBall4;
                    positionYBall4 -= (int) velocityYBall4;

                    ball4.setLocation(positionXBall4, positionYBall4);
                }

                positionX += (int) velocityX;
                positionY -= (int) velocityY;

                positionXBall2 += (int) velocityXBall2;
                positionYBall2 -= (int) velocityYBall2;

                positionXBall3 += (int) velocityXBall3;
                positionYBall3 -= (int) velocityYBall3;

                positionXBall4 += (int) velocityXBall4;
                positionYBall4 -= (int) velocityYBall4;

                velocityY -= gravity * 0.010;
                velocityYBall2 -= gravity * 0.010;
                velocityYBall3 -= gravity * 0.010;
                velocityYBall4 -= gravity * 0.010;

                ball.setLocation(positionX, positionY);
                ball2.setLocation(positionXBall2, positionYBall2);
                ball3.setLocation(positionXBall3, positionYBall3);
                ball4.setLocation(positionXBall4, positionYBall4);
            }
        });
        timer.start();
    }
}