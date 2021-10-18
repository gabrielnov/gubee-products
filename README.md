# API for products from Gubee

## Usage:

### GET Params:
``` 
stacks: list of strings separated by comma (ex.: stacks=sql,java)  

target: simple string (ex.: target=oracle)
```


### POST Body Payload:

```
productName: string
simpleDescription: string
fullDescription: string
target: string
stack: list of strings
```

Example:

```
{
 "productName":"Great Tech",
    "simpleDescription":"Lorem ipsum",
    "fullDescription":"Lorem ipsum, but longer",
    "target":"oracle",
    "stack":["sql","java","microsoft"]
}
```

### Routes
``` api/product ```
