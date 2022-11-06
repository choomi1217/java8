# Metaspace

JVM의 여러 메모리 영역 중에 PermGen이 사라지고 Metaspace가 생김.

### PermGen 
- class가 로드 될 때 클래스 정보를 담거나 static 필드들을 담던 (클래스의 메타데이터) 메모리 공간.
- Heap 영역에 속함.
- 기본적으로 제한된 크기.


### Metaspace
- Eden과 Old 와 다르게 Heap영역이 아닌 네이티브 메모리(os)에 자리를 잡음.
- OS 메모리가 다 사용될 때까지 늘어남 ( 최대값 설정이 꼭 필요함. )
