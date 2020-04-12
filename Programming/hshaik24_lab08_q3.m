xValues = linspace(-50,50,75);
yValues = zeros(size(xValues));
yValues = computeQuadratic(xValues);

p = [3,-2,-2000];

xRoots = roots(p);
yRoots = computeQuadratic(xRoots);

figure
hold on
plot(xValues, yValues);
scatter(xRoots, yRoots);
hold off