x_points = []
y_points = []
for i in range(3):
    x, y = map(int, input().split())
    x_points.append(x)
    y_points.append(y)
    
for i in range(3):
    if(x_points.count(x_points[i]) == 1):
        x_point = x_points[i]
           
for i in range(3):
    if(y_points.count(y_points[i]) == 1):
        y_point = y_points[i]
        
print(x_point, y_point)