Clear-Host

$userAns = ""

while ($userAns -ne "Who's there?") {
  $userAns = Read-Host "Knock! Knock!"
}

while ($userAns -ne "Orange who?") {
  $userAns = Read-Host "Orange"
}

Write-Host "Orange you going to let me in?"

Start-Sleep -Seconds 3

Clear-Host

while ($userAns -ne "Who's there?") {
  $userAns = Read-Host "Knock! Knock!"
}

while ($userAns -ne "Aunt who?") {
  $userAns = Read-Host "Aunt"
}

write-host "Aunt you glad to see me"?

Start-Sleep -Seconds 3

write-host "Copyright 2019 - Sridhar"