git bash 로 파일 올릴 때 

다음의 오류나면 
error: src refspec master does not match any
error: failed to push some refs to 'https://github.com/future-developerss/FinalResult.git

push 명령어를,

git push origin master -> git push origin main -f  로 변경해서 명령어 치면 잘 올라갈거에요~

위 오류로 힘들었어서,, 공유합니다~


************************************************
push 전 기존의 것들을 pull 한뒤 push 해야 합니다.. (공통작업이라 pull 과정 필수일거에요 아마..)

pull시에도,

git pull origin master -> git pull origin main -f 로 하면 됩니다.. (기존의 코드에서 조금 수정!)


---다른 branch pull 할때-----

git pull origin (branchname) --allow-unrelated-histories


***********************************************

survey창 일단 제가 소스코드 수정해서 올려놓았습니다 -진영
