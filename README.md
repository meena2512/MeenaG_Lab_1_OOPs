# MeenaG_Lab_1_OOPs
Hotel Room Allocation

Problem statement
As a hotel manager, I want to allocate rooms to people visiting my hotel according to their request. I have a multi-storied hotel with many rooms on each floor. 
The list of rooms present in each floor is given below. When a visitor queries for a specific kind of room I should be able to quickly allocate an available room.
Rooms on the first floor:
101 – Single Occupancy, AC
102 – Double Occupancy, AC
103 – Double Occupancy
Rooms on the second floor:
201 - Single Occupancy, AC
202 - Single Occupancy 
203 - Double Occupancy, AC
204 - Triple Occupancy, AC
When allocating a room I should also show an estimate of price. The cost of rooms is based on the occupancy as shown below:
Single occupancy: Rs. 2000 / day
Double occupancy: Rs. 3000 / day
Triple occupancy: Rs. 4000 / day
Air-conditioned rooms have fixed additional charge of Rs. 1000 / day.
The program needs to be able to take multiple inputs and maintain state.
Input 1:
Single occupancy AC
Output 1:
Room number: 101, first floor, air conditioned, single
occupancy, estimated: Rs. 3000 / day
Input 2:
Single occupancy AC
Output 2:
Room number: 201, second floor, air conditioned, single occupancy, estimated: Rs. 3000 / day
Input 3:
Single occupancy AC
Output 3:
Single occupancy AC room not available
Input 3:
Single occupancy non-AC
Output 3:
Room number: 202, second floor, non-air conditioned, single occupancy, estimated: Rs. 2000 / day
Extension: Nowadays some people come with very specific preferences saying they would prefer the room to be allocated in the specified floor. I want to be able to allocate rooms as per their preference.
Input 1:
Single occupancy AC second floor
Output 1:
Room number: 201, second floor, air conditioned, single occupancy
Input 2:
Single occupancy AC second floor
Output 2:
Single occupancy AC room not available

