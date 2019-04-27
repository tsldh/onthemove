#!/bin/bash
#Bash script for getting the release notes for the latest release.

file="History.md"

#Global variable for controlling which lines to use.
#Global variable for release notes.
useline="no"
release_notes=""

#Traverse through file.
while IFS= read -r line
do
  if [[ $line = v* ]]; then
    if [[ $useline = "yes" ]]; then
      break
    else
      useline="yes"
    fi
  fi
  if [[ $useline = "yes" ]]; then
    #Insert newline character for better portability.
    release_notes="$release_notes
$line"
  fi
done <"$file"

#Pipe release_notes and expose to bitrise build.
echo "$release_notes" > app/release_notes.txt