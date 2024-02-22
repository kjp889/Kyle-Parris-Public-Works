cmake_minimum_required(VERSION 3.21)
project(GroupProject)

set(CMAKE_CXX_STANDARD 14)

include_directories(.)

add_executable(GroupProject
        CageQueue.cpp
        CageQueue.h
        Driver.cpp
        Pet.cpp
        Pet.h Node.h)