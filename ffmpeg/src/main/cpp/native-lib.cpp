#include <jni.h>
#include <android/log.h>
extern "C"{
#include <libavformat/avformat.h>
}

extern "C"
JNIEXPORT jstring JNICALL
Java_com_example_ffmpeg_1test_MainActivity_helloNDK(JNIEnv* env,jobject,jstring msg){
    char* chello = (char *) env->GetStringUTFChars(msg, JNI_FALSE);
    __android_log_print(ANDROID_LOG_ERROR,"tag","c : %s",chello);#log日志打印
            __android_log_print(ANDROID_LOG_ERROR,"tag","编码器配置： %s",avcodec_configuration());#log日志打印
    char * newstr = strcat(chello,avcodec_configuration());#将java传过来的字符串和编码器配置信息拼接起来并返回去
    return env->NewStringUTF(newstr);
}
