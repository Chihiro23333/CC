# 设置最小使用版本
cmake_minimum_required(VERSION 3.4.1)

# 添加本地so库 native-lib：这个是声明引用so库的名称 SHARED：表示共享so库文件
# 构建so库的源文件
add_library(
    native-lib
    SHARED
    src/main/cpp/native-lib.cpp
)
# 使用系统ndk 提供的库，如 log库
# log-lib 这个指定的是在NDK库中每个类型的库会存放一个特定的位置，而log库存放
# 在log-lib中
# log 指定使用log库
find_library(
    log-lib
    log
)
#----------------------ffmpeg的库文件------------
# 加载头文件
include_directories(src/main/cpp/include)

# 加载avcodec-57库
#添加libavcodec-57.so
add_library( avcodec-57
        SHARED
        IMPORTED)
set_target_properties( avcodec-57
        PROPERTIES IMPORTED_LOCATION
        ${CMAKE_SOURCE_DIR}/src/main/jniLibs/${ANDROID_ABI}/libavcodec-57.so)


#添加libavdevice-57.so
add_library( avdevice-57
        SHARED
        IMPORTED)
set_target_properties( avdevice-57
        PROPERTIES IMPORTED_LOCATION
        ${CMAKE_SOURCE_DIR}/src/main/jniLibs/${ANDROID_ABI}/libavdevice-57.so)

add_library( avfilter-6
        SHARED
        IMPORTED)
set_target_properties( avfilter-6
        PROPERTIES IMPORTED_LOCATION
        ${CMAKE_SOURCE_DIR}/src/main/jniLibs/${ANDROID_ABI}/libavfilter-6.so)

add_library( avformat-57
        SHARED
        IMPORTED)
set_target_properties( avformat-57
        PROPERTIES IMPORTED_LOCATION
        ${CMAKE_SOURCE_DIR}/src/main/jniLibs/${ANDROID_ABI}/libavformat-57.so)

add_library( avutil-55
        SHARED
        IMPORTED)
set_target_properties( avutil-55
        PROPERTIES IMPORTED_LOCATION
        ${CMAKE_SOURCE_DIR}/src/main/jniLibs/${ANDROID_ABI}/libavutil-55.so)

add_library( swresample-2
        SHARED
        IMPORTED)
set_target_properties( swresample-2
        PROPERTIES IMPORTED_LOCATION
        ${CMAKE_SOURCE_DIR}/src/main/jniLibs/${ANDROID_ABI}/libswresample-2.so)

add_library( swscale-4
        SHARED
        IMPORTED)
set_target_properties( swscale-4
        PROPERTIES IMPORTED_LOCATION
        ${CMAKE_SOURCE_DIR}/src/main/jniLibs/${ANDROID_ABI}/libswscale-4.so)

add_library( postproc-54
        SHARED
        IMPORTED)
set_target_properties( postproc-54
        PROPERTIES IMPORTED_LOCATION
        ${CMAKE_SOURCE_DIR}/src/main/jniLibs/${ANDROID_ABI}/libpostproc-54.so)
#----------------------end-----------------------

# 如果你本地的库（native-lib）想要调用log库的方法，
# 那么就需要配置这个属性，意思是把NDK库关联到本地库。
# 第一个参数表示本地的库 native-lib 要调用到log库的方法，即要被关联的库名称，log-lib 要关联的库名称
target_link_libraries(
    native-lib
    #ffmpeg------start----------
    avcodec-57
    avdevice-57
    avfilter-6
    avformat-57
    avutil-55
    swresample-2
    swscale-4
    #ffmpeg------end------------
    ${log-lib}
)
