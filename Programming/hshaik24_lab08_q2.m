Grv = 9.81;
LnchAng = pi/3;
iniVelo = 35;
Tmax = 2*iniVelo*sin(LnchAng)/Grv;
timePoints = linspace(0,Tmax,250);
v = [iniVelo*cos(LnchAng),iniVelo*sin(LnchAng)-(Grv*timePoints)];

disp(v);





x = iniVelo*timePoints*cos(LnchAng);
y = iniVelo*timePoints*sin(LnchAng)-(1/2)*Grv*(timePoints.^2);

plot(x,y);

title("projectile motion");
xlabel("x distance");
ylabel("y distance");
