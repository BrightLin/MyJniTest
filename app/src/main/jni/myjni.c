#include "com_example_hui_myjnitest_MyJni.h"

jint JNICALL Java_com_example_hui_myjnitest_MyJni_add
  (JNIEnv *env, jobject obj, jint a, jint b)
{
    return a+b;
}