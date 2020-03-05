"""
AWS python function handler wrapper

"""
from . import index

def handler(event, context):
    return {
        'statusCode': 200,
        'body': index.handler(event)
    }
