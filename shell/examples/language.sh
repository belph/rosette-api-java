if [ $# -eq 0 ]; then
   echo "Must have API key to run example"
   exit 1
fi

curl "https://api.rosette.com/rest/v1/language" \
  -H 'user_key: $1' \
  -H 'Content-Type:application/json' \
  -H 'Accept:application/json' \
  -d '{"content": "${language_data}"}'