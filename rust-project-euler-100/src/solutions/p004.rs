use crate::Solvable;

fn is_palindromic(n: i64) -> bool {
    let s = n.to_string();
    let bytes = s.as_bytes();
    let len = bytes.len();
    (0..len / 2).all(|i| bytes[i] == bytes[len - 1 - i])
}

pub struct P004;
impl Solvable for P004 {
    fn problem_name(&self) -> &str { "p004" }
    fn solve(&self) -> i64 {
        let mut result = 0i64;
        for i in (100..=999).rev() {
            for j in (100..=999).rev() {
                let n = i * j;
                if n > result && is_palindromic(n) {
                    result = n;
                    break;
                }
            }
        }
        result
    }
}
